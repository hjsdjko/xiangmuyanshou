package com.entity.model;

import com.entity.ShenherizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 审核日志
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShenherizhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 审核人所属表
     */
    private String shenherizhiTable;


    /**
     * 审核人名字
     */
    private String shenherizhiName;


    /**
     * 审核人手机号
     */
    private String shenherizhiPhone;


    /**
     * 审核人身份证号
     */
    private String shenherizhiIdNumber;


    /**
     * 审核结果
     */
    private String shenherizhiJieguo;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：审核人所属表
	 */
    public String getShenherizhiTable() {
        return shenherizhiTable;
    }


    /**
	 * 设置：审核人所属表
	 */
    public void setShenherizhiTable(String shenherizhiTable) {
        this.shenherizhiTable = shenherizhiTable;
    }
    /**
	 * 获取：审核人名字
	 */
    public String getShenherizhiName() {
        return shenherizhiName;
    }


    /**
	 * 设置：审核人名字
	 */
    public void setShenherizhiName(String shenherizhiName) {
        this.shenherizhiName = shenherizhiName;
    }
    /**
	 * 获取：审核人手机号
	 */
    public String getShenherizhiPhone() {
        return shenherizhiPhone;
    }


    /**
	 * 设置：审核人手机号
	 */
    public void setShenherizhiPhone(String shenherizhiPhone) {
        this.shenherizhiPhone = shenherizhiPhone;
    }
    /**
	 * 获取：审核人身份证号
	 */
    public String getShenherizhiIdNumber() {
        return shenherizhiIdNumber;
    }


    /**
	 * 设置：审核人身份证号
	 */
    public void setShenherizhiIdNumber(String shenherizhiIdNumber) {
        this.shenherizhiIdNumber = shenherizhiIdNumber;
    }
    /**
	 * 获取：审核结果
	 */
    public String getShenherizhiJieguo() {
        return shenherizhiJieguo;
    }


    /**
	 * 设置：审核结果
	 */
    public void setShenherizhiJieguo(String shenherizhiJieguo) {
        this.shenherizhiJieguo = shenherizhiJieguo;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
