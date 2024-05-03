package com.dao;

import com.entity.ShenherizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenherizhiView;

/**
 * 审核日志 Dao 接口
 *
 * @author 
 */
public interface ShenherizhiDao extends BaseMapper<ShenherizhiEntity> {

   List<ShenherizhiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
