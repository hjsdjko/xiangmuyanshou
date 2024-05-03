package com.entity.vo;

import com.entity.ShenherizhiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 审核日志
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shenherizhi")
public class ShenherizhiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 审核人所属表
     */

    @TableField(value = "shenherizhi_table")
    private String shenherizhiTable;


    /**
     * 审核人名字
     */

    @TableField(value = "shenherizhi_name")
    private String shenherizhiName;


    /**
     * 审核人手机号
     */

    @TableField(value = "shenherizhi_phone")
    private String shenherizhiPhone;


    /**
     * 审核人身份证号
     */

    @TableField(value = "shenherizhi_id_number")
    private String shenherizhiIdNumber;


    /**
     * 审核结果
     */

    @TableField(value = "shenherizhi_jieguo")
    private String shenherizhiJieguo;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：审核人所属表
	 */
    public String getShenherizhiTable() {
        return shenherizhiTable;
    }


    /**
	 * 获取：审核人所属表
	 */

    public void setShenherizhiTable(String shenherizhiTable) {
        this.shenherizhiTable = shenherizhiTable;
    }
    /**
	 * 设置：审核人名字
	 */
    public String getShenherizhiName() {
        return shenherizhiName;
    }


    /**
	 * 获取：审核人名字
	 */

    public void setShenherizhiName(String shenherizhiName) {
        this.shenherizhiName = shenherizhiName;
    }
    /**
	 * 设置：审核人手机号
	 */
    public String getShenherizhiPhone() {
        return shenherizhiPhone;
    }


    /**
	 * 获取：审核人手机号
	 */

    public void setShenherizhiPhone(String shenherizhiPhone) {
        this.shenherizhiPhone = shenherizhiPhone;
    }
    /**
	 * 设置：审核人身份证号
	 */
    public String getShenherizhiIdNumber() {
        return shenherizhiIdNumber;
    }


    /**
	 * 获取：审核人身份证号
	 */

    public void setShenherizhiIdNumber(String shenherizhiIdNumber) {
        this.shenherizhiIdNumber = shenherizhiIdNumber;
    }
    /**
	 * 设置：审核结果
	 */
    public String getShenherizhiJieguo() {
        return shenherizhiJieguo;
    }


    /**
	 * 获取：审核结果
	 */

    public void setShenherizhiJieguo(String shenherizhiJieguo) {
        this.shenherizhiJieguo = shenherizhiJieguo;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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

}
