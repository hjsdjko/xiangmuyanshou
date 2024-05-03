








package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 项目
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/xiangmu")
public class XiangmuController {
    private static final Logger logger = LoggerFactory.getLogger(XiangmuController.class);

    @Autowired
    private XiangmuService xiangmuService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private XiangmuguanliyuanService xiangmuguanliyuanService;
    @Autowired
    private YonghuService yonghuService;

    @Autowired
    private ZhuanjiaService zhuanjiaService;
    @Autowired
    private ShenherizhiService shenherizhiService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
//        else if("项目管理员".equals(role))
//            params.put("xiangmuguanliyuanId",request.getSession().getAttribute("userId"));
//        else if("专家账户".equals(role))
//            params.put("zhuanjiaId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = xiangmuService.queryPage(params);

        //字典表数据转换
        List<XiangmuView> list =(List<XiangmuView>)page.getList();
        for(XiangmuView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XiangmuEntity xiangmu = xiangmuService.selectById(id);
        if(xiangmu !=null){
            //entity转view
            XiangmuView view = new XiangmuView();
            BeanUtils.copyProperties( xiangmu , view );//把实体数据重构到view中

                //级联表
                XiangmuguanliyuanEntity xiangmuguanliyuan = xiangmuguanliyuanService.selectById(xiangmu.getXiangmuguanliyuanId());
                if(xiangmuguanliyuan != null){
                    BeanUtils.copyProperties( xiangmuguanliyuan , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setXiangmuguanliyuanId(xiangmuguanliyuan.getId());
                }
                //级联表
                YonghuEntity yonghu = yonghuService.selectById(xiangmu.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody XiangmuEntity xiangmu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,xiangmu:{}",this.getClass().getName(),xiangmu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("用户".equals(role))
            xiangmu.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("项目管理员".equals(role))
            xiangmu.setXiangmuguanliyuanId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        Wrapper<XiangmuEntity> queryWrapper = new EntityWrapper<XiangmuEntity>()
            .eq("xiangmu_uuid_number", xiangmu.getXiangmuUuidNumber())
            .eq("yonghu_id", xiangmu.getYonghuId())
            .eq("xiangmu_name", xiangmu.getXiangmuName())
            .eq("xiangmu_types", xiangmu.getXiangmuTypes())
            .eq("xiangmuguanliyuan_id", xiangmu.getXiangmuguanliyuanId())
            .eq("xiangmu_yesno_types", xiangmu.getXiangmuYesnoTypes())
            .eq("zhuanjia1_uuid_number", xiangmu.getZhuanjia1UuidNumber())
            .eq("zhuanjia1_name", xiangmu.getZhuanjia1Name())
            .eq("zhuanjia1_types", xiangmu.getZhuanjia1Types())
            .eq("zhuanjia2_uuid_number", xiangmu.getZhuanjia2UuidNumber())
            .eq("zhuanjia2_name", xiangmu.getZhuanjia2Name())
            .eq("zhuanjia2_types", xiangmu.getZhuanjia2Types())
            .eq("zhuanjia3_uuid_number", xiangmu.getZhuanjia3UuidNumber())
            .eq("zhuanjia3_name", xiangmu.getZhuanjia3Name())
            .eq("zhuanjia3_types", xiangmu.getZhuanjia3Types())
            .eq("zuizhong_types", xiangmu.getZuizhongTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XiangmuEntity xiangmuEntity = xiangmuService.selectOne(queryWrapper);
        if(xiangmuEntity==null){
            xiangmu.setXiangmuYesnoTypes(1);
            xiangmu.setCreateTime(new Date());
            xiangmu.setXiangmuYesnoTypes(1);
            xiangmu.setZhuanjia1Types(1);
            xiangmu.setZhuanjia2Types(1);
            xiangmu.setZhuanjia3Types(1);
            xiangmu.setZuizhongTypes(1);
            xiangmuService.insert(xiangmu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody XiangmuEntity xiangmu, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,xiangmu:{}",this.getClass().getName(),xiangmu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("用户".equals(role))
            xiangmu.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("项目管理员".equals(role))
            xiangmu.setXiangmuguanliyuanId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<XiangmuEntity> queryWrapper = new EntityWrapper<XiangmuEntity>()
            .notIn("id",xiangmu.getId())
            .andNew()
            .eq("xiangmu_uuid_number", xiangmu.getXiangmuUuidNumber())
            .eq("yonghu_id", xiangmu.getYonghuId())
            .eq("xiangmu_name", xiangmu.getXiangmuName())
            .eq("xiangmu_types", xiangmu.getXiangmuTypes())
            .eq("xiangmuguanliyuan_id", xiangmu.getXiangmuguanliyuanId())
            .eq("xiangmu_yesno_types", xiangmu.getXiangmuYesnoTypes())
            .eq("zhuanjia1_uuid_number", xiangmu.getZhuanjia1UuidNumber())
            .eq("zhuanjia1_name", xiangmu.getZhuanjia1Name())
            .eq("zhuanjia1_types", xiangmu.getZhuanjia1Types())
            .eq("zhuanjia2_uuid_number", xiangmu.getZhuanjia2UuidNumber())
            .eq("zhuanjia2_name", xiangmu.getZhuanjia2Name())
            .eq("zhuanjia2_types", xiangmu.getZhuanjia2Types())
            .eq("zhuanjia3_uuid_number", xiangmu.getZhuanjia3UuidNumber())
            .eq("zhuanjia3_name", xiangmu.getZhuanjia3Name())
            .eq("zhuanjia3_types", xiangmu.getZhuanjia3Types())
            .eq("zuizhong_types", xiangmu.getZuizhongTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XiangmuEntity xiangmuEntity = xiangmuService.selectOne(queryWrapper);
        if("".equals(xiangmu.getXiangmuPhoto()) || "null".equals(xiangmu.getXiangmuPhoto())){
                xiangmu.setXiangmuPhoto(null);
        }
        if("".equals(xiangmu.getXiangmuFile()) || "null".equals(xiangmu.getXiangmuFile())){
                xiangmu.setXiangmuFile(null);
        }
        if(xiangmuEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      xiangmu.set
            //  }
            xiangmuService.updateById(xiangmu);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        xiangmuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**.
     * 后端修改
     */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestParam Map<String, Object> params, HttpServletRequest request){
//        logger.debug("shenhe方法:,,Controller:{},,data:{}",this.getClass().getName(),JSONObject.toJSONString(data));
//
//        Integer id = Integer.valueOf(String.valueOf(data.get("id")));//当前数据的id
//        Integer shenherenTypes = Integer.valueOf(String.valueOf(data.get("shenherenTypes")));//审核结果
//        String shenherenContent = String.valueOf(data.get("shenherenContent"));//审核意见

        logger.debug("shenhe方法:,,Controller:{},,data:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        Integer id = Integer.valueOf(String.valueOf(params.get("id")));//当前数据的id
        Integer shenherenTypes = Integer.valueOf(String.valueOf(params.get("shenherenTypes")));//审核结果
        String shenherenContent = String.valueOf(params.get("shenherenContent"));//审核意见

        //审核日志
        ShenherizhiEntity shenherizhiEntity = new ShenherizhiEntity();
        shenherizhiEntity.setCreateTime(new Date());
        shenherizhiEntity.setInsertTime(new Date());
        if(shenherenTypes == 2){
            shenherizhiEntity.setShenherizhiJieguo("审核通过");
        }else if(shenherenTypes == 3){
            shenherizhiEntity.setShenherizhiJieguo("审核不通过");
        }else{
            shenherizhiEntity.setShenherizhiJieguo("未知审核结果");
        }


        XiangmuEntity xiangmuEntity = xiangmuService.selectById(id);
        if(xiangmuEntity == null){
            return R.error(511,"查不到项目");
        }

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("用户".equals(role)) {
            return R.error(511,"您不能审核");
        }
        else if("项目管理员".equals(role)){
            if(xiangmuEntity.getXiangmuguanliyuanId() != null  || xiangmuEntity.getXiangmuYesnoTypes() != 1){
                return R.error(511,"该项目已经被项目管理员权限审核过");
            }
        }else if("专家账户".equals(role)){
            if(xiangmuEntity.getZhuanjia1Types() != 1 && xiangmuEntity.getZhuanjia2Types() != 1 && xiangmuEntity.getZhuanjia3Types() != 1){
                return R.error(511,"该项目已经被三位专家审核过");
            }
        }
        Integer userId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));


        if("项目管理员".equals(role)){
            XiangmuguanliyuanEntity xiangmuguanliyuanEntity = xiangmuguanliyuanService.selectById(userId);
            if(xiangmuguanliyuanEntity == null){
                return R.error(511,"查询不到审核管理员");
            }

            xiangmuEntity.setXiangmuguanliyuanId(userId);//审核人id
            xiangmuEntity.setXiangmuYesnoTypes(shenherenTypes);//审核结果
            xiangmuEntity.setXiangmuguanliyuanContent(shenherenContent);//审核意见
            xiangmuEntity.setZhuanjia1Types(1);
            xiangmuEntity.setZhuanjia2Types(1);
            xiangmuEntity.setZhuanjia3Types(1);
            xiangmuEntity.setZuizhongTypes(1);

            //审核日志
            shenherizhiEntity.setShenherizhiTable("项目管理员表");
            shenherizhiEntity.setShenherizhiName(xiangmuguanliyuanEntity.getXiangmuguanliyuanName());
            shenherizhiEntity.setShenherizhiPhone(xiangmuguanliyuanEntity.getXiangmuguanliyuanPhone());
            shenherizhiEntity.setShenherizhiIdNumber(xiangmuguanliyuanEntity.getXiangmuguanliyuanIdNumber());

        }else if("专家账户".equals(role)){
            ZhuanjiaEntity zhuanjiaEntity = zhuanjiaService.selectById(userId);
            if(zhuanjiaEntity == null){
                return R.error(511,"查询不到专家");
            }

            if(xiangmuEntity.getZhuanjia1Types()==1){
                xiangmuEntity.setZhuanjia1Name(zhuanjiaEntity.getZhuanjiaName());
                xiangmuEntity.setZhuanjia1UuidNumber(zhuanjiaEntity.getZhuanjiaUuidNumber());
                xiangmuEntity.setZhuanjia1Types(shenherenTypes);
                xiangmuEntity.setZhuanjia1YijianContent(shenherenContent);
            }else if(xiangmuEntity.getZhuanjia2Types()==1){
                xiangmuEntity.setZhuanjia2Name(zhuanjiaEntity.getZhuanjiaName());
                xiangmuEntity.setZhuanjia2UuidNumber(zhuanjiaEntity.getZhuanjiaUuidNumber());
                xiangmuEntity.setZhuanjia2Types(shenherenTypes);
                xiangmuEntity.setZhuanjia2YijianContent(shenherenContent);

                if(zhuanjiaEntity.getZhuanjiaUuidNumber().equals(xiangmuEntity.getZhuanjia1UuidNumber())){
                    return R.error(511,"您已经审核过此工单");
                }
            }else if(xiangmuEntity.getZhuanjia3Types()==1){
                xiangmuEntity.setZhuanjia3Name(zhuanjiaEntity.getZhuanjiaName());
                xiangmuEntity.setZhuanjia3UuidNumber(zhuanjiaEntity.getZhuanjiaUuidNumber());
                xiangmuEntity.setZhuanjia3Types(shenherenTypes);
                xiangmuEntity.setZhuanjia3YijianContent(shenherenContent);

                if(zhuanjiaEntity.getZhuanjiaUuidNumber().equals(xiangmuEntity.getZhuanjia1UuidNumber()) || zhuanjiaEntity.getZhuanjiaUuidNumber().equals(xiangmuEntity.getZhuanjia2UuidNumber()) ){
                    return R.error(511,"您已经审核过此工单");
                }
            }else{
                return R.error(511,"该项目已经被三位专家审核过");
            }

            //审核日志
            shenherizhiEntity.setShenherizhiTable("项目管理员表");
            shenherizhiEntity.setShenherizhiName(zhuanjiaEntity.getZhuanjiaName());
            shenherizhiEntity.setShenherizhiPhone(zhuanjiaEntity.getZhuanjiaPhone());
            shenherizhiEntity.setShenherizhiIdNumber(zhuanjiaEntity.getZhuanjiaIdNumber());

            if(xiangmuEntity.getZhuanjia1Types() != 1 && xiangmuEntity.getZhuanjia2Types() != 1 && xiangmuEntity.getZhuanjia3Types() != 1){
                if(xiangmuEntity.getZhuanjia1Types() == 2 && xiangmuEntity.getZhuanjia2Types() == 2 && xiangmuEntity.getZhuanjia3Types() == 2){
                    xiangmuEntity.setZuizhongTypes(2);
                }else{
                    xiangmuEntity.setZuizhongTypes(3);
                }
            }

        }else{
            return R.error(511,"未知审核人权限，请联系管理员核实");
        }

        xiangmuService.updateById(xiangmuEntity);//更改项目项目中审核部分
        shenherizhiService.insert(shenherizhiEntity);//增加项目审核日志

        return R.ok();
    }





}
