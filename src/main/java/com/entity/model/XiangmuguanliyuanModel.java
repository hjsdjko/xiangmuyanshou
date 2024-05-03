package com.entity.model;

import com.entity.XiangmuguanliyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 项目管理员
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiangmuguanliyuanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 项目管理员姓名
     */
    private String xiangmuguanliyuanName;


    /**
     * 联系电话
     */
    private String xiangmuguanliyuanPhone;


    /**
     * 项目管理员身份证号
     */
    private String xiangmuguanliyuanIdNumber;


    /**
     * 头像
     */
    private String xiangmuguanliyuanPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    private String xiangmuguanliyuanEmail;


    /**
     * 住址
     */
    private String xiangmuguanliyuanAddress;


    /**
     * 逻辑删除
     */
    private Integer xiangmuguanliyuanDelete;


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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：项目管理员姓名
	 */
    public String getXiangmuguanliyuanName() {
        return xiangmuguanliyuanName;
    }


    /**
	 * 设置：项目管理员姓名
	 */
    public void setXiangmuguanliyuanName(String xiangmuguanliyuanName) {
        this.xiangmuguanliyuanName = xiangmuguanliyuanName;
    }
    /**
	 * 获取：联系电话
	 */
    public String getXiangmuguanliyuanPhone() {
        return xiangmuguanliyuanPhone;
    }


    /**
	 * 设置：联系电话
	 */
    public void setXiangmuguanliyuanPhone(String xiangmuguanliyuanPhone) {
        this.xiangmuguanliyuanPhone = xiangmuguanliyuanPhone;
    }
    /**
	 * 获取：项目管理员身份证号
	 */
    public String getXiangmuguanliyuanIdNumber() {
        return xiangmuguanliyuanIdNumber;
    }


    /**
	 * 设置：项目管理员身份证号
	 */
    public void setXiangmuguanliyuanIdNumber(String xiangmuguanliyuanIdNumber) {
        this.xiangmuguanliyuanIdNumber = xiangmuguanliyuanIdNumber;
    }
    /**
	 * 获取：头像
	 */
    public String getXiangmuguanliyuanPhoto() {
        return xiangmuguanliyuanPhoto;
    }


    /**
	 * 设置：头像
	 */
    public void setXiangmuguanliyuanPhoto(String xiangmuguanliyuanPhoto) {
        this.xiangmuguanliyuanPhoto = xiangmuguanliyuanPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getXiangmuguanliyuanEmail() {
        return xiangmuguanliyuanEmail;
    }


    /**
	 * 设置：电子邮箱
	 */
    public void setXiangmuguanliyuanEmail(String xiangmuguanliyuanEmail) {
        this.xiangmuguanliyuanEmail = xiangmuguanliyuanEmail;
    }
    /**
	 * 获取：住址
	 */
    public String getXiangmuguanliyuanAddress() {
        return xiangmuguanliyuanAddress;
    }


    /**
	 * 设置：住址
	 */
    public void setXiangmuguanliyuanAddress(String xiangmuguanliyuanAddress) {
        this.xiangmuguanliyuanAddress = xiangmuguanliyuanAddress;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getXiangmuguanliyuanDelete() {
        return xiangmuguanliyuanDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setXiangmuguanliyuanDelete(Integer xiangmuguanliyuanDelete) {
        this.xiangmuguanliyuanDelete = xiangmuguanliyuanDelete;
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
