package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 项目
 *
 * @author 
 * @email
 */
@TableName("xiangmu")
public class XiangmuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiangmuEntity() {

	}

	public XiangmuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 项目唯一标识
     */
    @TableField(value = "xiangmu_uuid_number")

    private String xiangmuUuidNumber;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 项目名称
     */
    @TableField(value = "xiangmu_name")

    private String xiangmuName;


    /**
     * 项目照片
     */
    @TableField(value = "xiangmu_photo")

    private String xiangmuPhoto;


    /**
     * 项目类型
     */
    @TableField(value = "xiangmu_types")

    private Integer xiangmuTypes;


    /**
     * 验收申请书
     */
    @TableField(value = "xiangmu_file")

    private String xiangmuFile;


    /**
     * 项目简介
     */
    @TableField(value = "xiangmu_content")

    private String xiangmuContent;


    /**
     * 项目管理员
     */
    @TableField(value = "xiangmuguanliyuan_id")

    private Integer xiangmuguanliyuanId;


    /**
     * 项目管理员审核结果
     */
    @TableField(value = "xiangmu_yesno_types")

    private Integer xiangmuYesnoTypes;


    /**
     * 项目管理员审核意见
     */
    @TableField(value = "xiangmuguanliyuan_content")

    private String xiangmuguanliyuanContent;


    /**
     * 专家1的唯一标识
     */
    @TableField(value = "zhuanjia1_uuid_number")

    private String zhuanjia1UuidNumber;


    /**
     * 专家1姓名
     */
    @TableField(value = "zhuanjia1_name")

    private String zhuanjia1Name;


    /**
     * 专家1的审核结果
     */
    @TableField(value = "zhuanjia1_types")

    private Integer zhuanjia1Types;


    /**
     * 专家1的审核意见
     */
    @TableField(value = "zhuanjia1_yijian_content")

    private String zhuanjia1YijianContent;


    /**
     * 专家2的唯一标识
     */
    @TableField(value = "zhuanjia2_uuid_number")

    private String zhuanjia2UuidNumber;


    /**
     * 专家2姓名
     */
    @TableField(value = "zhuanjia2_name")

    private String zhuanjia2Name;


    /**
     * 专家2的审核结果
     */
    @TableField(value = "zhuanjia2_types")

    private Integer zhuanjia2Types;


    /**
     * 专家2的审核意见
     */
    @TableField(value = "zhuanjia2_yijian_content")

    private String zhuanjia2YijianContent;


    /**
     * 专家3的唯一标识
     */
    @TableField(value = "zhuanjia3_uuid_number")

    private String zhuanjia3UuidNumber;


    /**
     * 专家3姓名
     */
    @TableField(value = "zhuanjia3_name")

    private String zhuanjia3Name;


    /**
     * 专家3的审核结果
     */
    @TableField(value = "zhuanjia3_types")

    private Integer zhuanjia3Types;


    /**
     * 专家3的审核意见
     */
    @TableField(value = "zhuanjia3_yijian_content")

    private String zhuanjia3YijianContent;


    /**
     * 最终审核结果
     */
    @TableField(value = "zuizhong_types")

    private Integer zuizhongTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：项目唯一标识
	 */
    public String getXiangmuUuidNumber() {
        return xiangmuUuidNumber;
    }


    /**
	 * 获取：项目唯一标识
	 */

    public void setXiangmuUuidNumber(String xiangmuUuidNumber) {
        this.xiangmuUuidNumber = xiangmuUuidNumber;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：项目名称
	 */
    public String getXiangmuName() {
        return xiangmuName;
    }


    /**
	 * 获取：项目名称
	 */

    public void setXiangmuName(String xiangmuName) {
        this.xiangmuName = xiangmuName;
    }
    /**
	 * 设置：项目照片
	 */
    public String getXiangmuPhoto() {
        return xiangmuPhoto;
    }


    /**
	 * 获取：项目照片
	 */

    public void setXiangmuPhoto(String xiangmuPhoto) {
        this.xiangmuPhoto = xiangmuPhoto;
    }
    /**
	 * 设置：项目类型
	 */
    public Integer getXiangmuTypes() {
        return xiangmuTypes;
    }


    /**
	 * 获取：项目类型
	 */

    public void setXiangmuTypes(Integer xiangmuTypes) {
        this.xiangmuTypes = xiangmuTypes;
    }
    /**
	 * 设置：验收申请书
	 */
    public String getXiangmuFile() {
        return xiangmuFile;
    }


    /**
	 * 获取：验收申请书
	 */

    public void setXiangmuFile(String xiangmuFile) {
        this.xiangmuFile = xiangmuFile;
    }
    /**
	 * 设置：项目简介
	 */
    public String getXiangmuContent() {
        return xiangmuContent;
    }


    /**
	 * 获取：项目简介
	 */

    public void setXiangmuContent(String xiangmuContent) {
        this.xiangmuContent = xiangmuContent;
    }
    /**
	 * 设置：项目管理员
	 */
    public Integer getXiangmuguanliyuanId() {
        return xiangmuguanliyuanId;
    }


    /**
	 * 获取：项目管理员
	 */

    public void setXiangmuguanliyuanId(Integer xiangmuguanliyuanId) {
        this.xiangmuguanliyuanId = xiangmuguanliyuanId;
    }
    /**
	 * 设置：项目管理员审核结果
	 */
    public Integer getXiangmuYesnoTypes() {
        return xiangmuYesnoTypes;
    }


    /**
	 * 获取：项目管理员审核结果
	 */

    public void setXiangmuYesnoTypes(Integer xiangmuYesnoTypes) {
        this.xiangmuYesnoTypes = xiangmuYesnoTypes;
    }
    /**
	 * 设置：项目管理员审核意见
	 */
    public String getXiangmuguanliyuanContent() {
        return xiangmuguanliyuanContent;
    }


    /**
	 * 获取：项目管理员审核意见
	 */

    public void setXiangmuguanliyuanContent(String xiangmuguanliyuanContent) {
        this.xiangmuguanliyuanContent = xiangmuguanliyuanContent;
    }
    /**
	 * 设置：专家1的唯一标识
	 */
    public String getZhuanjia1UuidNumber() {
        return zhuanjia1UuidNumber;
    }


    /**
	 * 获取：专家1的唯一标识
	 */

    public void setZhuanjia1UuidNumber(String zhuanjia1UuidNumber) {
        this.zhuanjia1UuidNumber = zhuanjia1UuidNumber;
    }
    /**
	 * 设置：专家1姓名
	 */
    public String getZhuanjia1Name() {
        return zhuanjia1Name;
    }


    /**
	 * 获取：专家1姓名
	 */

    public void setZhuanjia1Name(String zhuanjia1Name) {
        this.zhuanjia1Name = zhuanjia1Name;
    }
    /**
	 * 设置：专家1的审核结果
	 */
    public Integer getZhuanjia1Types() {
        return zhuanjia1Types;
    }


    /**
	 * 获取：专家1的审核结果
	 */

    public void setZhuanjia1Types(Integer zhuanjia1Types) {
        this.zhuanjia1Types = zhuanjia1Types;
    }
    /**
	 * 设置：专家1的审核意见
	 */
    public String getZhuanjia1YijianContent() {
        return zhuanjia1YijianContent;
    }


    /**
	 * 获取：专家1的审核意见
	 */

    public void setZhuanjia1YijianContent(String zhuanjia1YijianContent) {
        this.zhuanjia1YijianContent = zhuanjia1YijianContent;
    }
    /**
	 * 设置：专家2的唯一标识
	 */
    public String getZhuanjia2UuidNumber() {
        return zhuanjia2UuidNumber;
    }


    /**
	 * 获取：专家2的唯一标识
	 */

    public void setZhuanjia2UuidNumber(String zhuanjia2UuidNumber) {
        this.zhuanjia2UuidNumber = zhuanjia2UuidNumber;
    }
    /**
	 * 设置：专家2姓名
	 */
    public String getZhuanjia2Name() {
        return zhuanjia2Name;
    }


    /**
	 * 获取：专家2姓名
	 */

    public void setZhuanjia2Name(String zhuanjia2Name) {
        this.zhuanjia2Name = zhuanjia2Name;
    }
    /**
	 * 设置：专家2的审核结果
	 */
    public Integer getZhuanjia2Types() {
        return zhuanjia2Types;
    }


    /**
	 * 获取：专家2的审核结果
	 */

    public void setZhuanjia2Types(Integer zhuanjia2Types) {
        this.zhuanjia2Types = zhuanjia2Types;
    }
    /**
	 * 设置：专家2的审核意见
	 */
    public String getZhuanjia2YijianContent() {
        return zhuanjia2YijianContent;
    }


    /**
	 * 获取：专家2的审核意见
	 */

    public void setZhuanjia2YijianContent(String zhuanjia2YijianContent) {
        this.zhuanjia2YijianContent = zhuanjia2YijianContent;
    }
    /**
	 * 设置：专家3的唯一标识
	 */
    public String getZhuanjia3UuidNumber() {
        return zhuanjia3UuidNumber;
    }


    /**
	 * 获取：专家3的唯一标识
	 */

    public void setZhuanjia3UuidNumber(String zhuanjia3UuidNumber) {
        this.zhuanjia3UuidNumber = zhuanjia3UuidNumber;
    }
    /**
	 * 设置：专家3姓名
	 */
    public String getZhuanjia3Name() {
        return zhuanjia3Name;
    }


    /**
	 * 获取：专家3姓名
	 */

    public void setZhuanjia3Name(String zhuanjia3Name) {
        this.zhuanjia3Name = zhuanjia3Name;
    }
    /**
	 * 设置：专家3的审核结果
	 */
    public Integer getZhuanjia3Types() {
        return zhuanjia3Types;
    }


    /**
	 * 获取：专家3的审核结果
	 */

    public void setZhuanjia3Types(Integer zhuanjia3Types) {
        this.zhuanjia3Types = zhuanjia3Types;
    }
    /**
	 * 设置：专家3的审核意见
	 */
    public String getZhuanjia3YijianContent() {
        return zhuanjia3YijianContent;
    }


    /**
	 * 获取：专家3的审核意见
	 */

    public void setZhuanjia3YijianContent(String zhuanjia3YijianContent) {
        this.zhuanjia3YijianContent = zhuanjia3YijianContent;
    }
    /**
	 * 设置：最终审核结果
	 */
    public Integer getZuizhongTypes() {
        return zuizhongTypes;
    }


    /**
	 * 获取：最终审核结果
	 */

    public void setZuizhongTypes(Integer zuizhongTypes) {
        this.zuizhongTypes = zuizhongTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xiangmu{" +
            "id=" + id +
            ", xiangmuUuidNumber=" + xiangmuUuidNumber +
            ", yonghuId=" + yonghuId +
            ", xiangmuName=" + xiangmuName +
            ", xiangmuPhoto=" + xiangmuPhoto +
            ", xiangmuTypes=" + xiangmuTypes +
            ", xiangmuFile=" + xiangmuFile +
            ", xiangmuContent=" + xiangmuContent +
            ", xiangmuguanliyuanId=" + xiangmuguanliyuanId +
            ", xiangmuYesnoTypes=" + xiangmuYesnoTypes +
            ", xiangmuguanliyuanContent=" + xiangmuguanliyuanContent +
            ", zhuanjia1UuidNumber=" + zhuanjia1UuidNumber +
            ", zhuanjia1Name=" + zhuanjia1Name +
            ", zhuanjia1Types=" + zhuanjia1Types +
            ", zhuanjia1YijianContent=" + zhuanjia1YijianContent +
            ", zhuanjia2UuidNumber=" + zhuanjia2UuidNumber +
            ", zhuanjia2Name=" + zhuanjia2Name +
            ", zhuanjia2Types=" + zhuanjia2Types +
            ", zhuanjia2YijianContent=" + zhuanjia2YijianContent +
            ", zhuanjia3UuidNumber=" + zhuanjia3UuidNumber +
            ", zhuanjia3Name=" + zhuanjia3Name +
            ", zhuanjia3Types=" + zhuanjia3Types +
            ", zhuanjia3YijianContent=" + zhuanjia3YijianContent +
            ", zuizhongTypes=" + zuizhongTypes +
            ", createTime=" + createTime +
        "}";
    }
}
