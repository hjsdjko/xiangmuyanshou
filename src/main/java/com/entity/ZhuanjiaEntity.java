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
 * 专家账户
 *
 * @author 
 * @email
 */
@TableName("zhuanjia")
public class ZhuanjiaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhuanjiaEntity() {

	}

	public ZhuanjiaEntity(T t) {
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
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 专家唯一标识
     */
    @TableField(value = "zhuanjia_uuid_number")

    private String zhuanjiaUuidNumber;


    /**
     * 专家姓名
     */
    @TableField(value = "zhuanjia_name")

    private String zhuanjiaName;


    /**
     * 专家联系电话
     */
    @TableField(value = "zhuanjia_phone")

    private String zhuanjiaPhone;


    /**
     * 专家身份证号
     */
    @TableField(value = "zhuanjia_id_number")

    private String zhuanjiaIdNumber;


    /**
     * 头像
     */
    @TableField(value = "zhuanjia_photo")

    private String zhuanjiaPhoto;


    /**
     * 是否使用
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：专家唯一标识
	 */
    public String getZhuanjiaUuidNumber() {
        return zhuanjiaUuidNumber;
    }


    /**
	 * 获取：专家唯一标识
	 */

    public void setZhuanjiaUuidNumber(String zhuanjiaUuidNumber) {
        this.zhuanjiaUuidNumber = zhuanjiaUuidNumber;
    }
    /**
	 * 设置：专家姓名
	 */
    public String getZhuanjiaName() {
        return zhuanjiaName;
    }


    /**
	 * 获取：专家姓名
	 */

    public void setZhuanjiaName(String zhuanjiaName) {
        this.zhuanjiaName = zhuanjiaName;
    }
    /**
	 * 设置：专家联系电话
	 */
    public String getZhuanjiaPhone() {
        return zhuanjiaPhone;
    }


    /**
	 * 获取：专家联系电话
	 */

    public void setZhuanjiaPhone(String zhuanjiaPhone) {
        this.zhuanjiaPhone = zhuanjiaPhone;
    }
    /**
	 * 设置：专家身份证号
	 */
    public String getZhuanjiaIdNumber() {
        return zhuanjiaIdNumber;
    }


    /**
	 * 获取：专家身份证号
	 */

    public void setZhuanjiaIdNumber(String zhuanjiaIdNumber) {
        this.zhuanjiaIdNumber = zhuanjiaIdNumber;
    }
    /**
	 * 设置：头像
	 */
    public String getZhuanjiaPhoto() {
        return zhuanjiaPhoto;
    }


    /**
	 * 获取：头像
	 */

    public void setZhuanjiaPhoto(String zhuanjiaPhoto) {
        this.zhuanjiaPhoto = zhuanjiaPhoto;
    }
    /**
	 * 设置：是否使用
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否使用
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
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
        return "Zhuanjia{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", zhuanjiaUuidNumber=" + zhuanjiaUuidNumber +
            ", zhuanjiaName=" + zhuanjiaName +
            ", zhuanjiaPhone=" + zhuanjiaPhone +
            ", zhuanjiaIdNumber=" + zhuanjiaIdNumber +
            ", zhuanjiaPhoto=" + zhuanjiaPhoto +
            ", shangxiaTypes=" + shangxiaTypes +
            ", createTime=" + createTime +
        "}";
    }
}
