package com.entity.view;

import com.entity.XiangmuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 项目
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xiangmu")
public class XiangmuView extends XiangmuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 项目类型的值
		*/
		private String xiangmuValue;
		/**
		* 项目管理员审核结果的值
		*/
		private String xiangmuYesnoValue;
		/**
		* 专家1的审核结果的值
		*/
		private String zhuanjia1Value;
		/**
		* 专家2的审核结果的值
		*/
		private String zhuanjia2Value;
		/**
		* 专家3的审核结果的值
		*/
		private String zhuanjia3Value;
		/**
		* 最终审核结果的值
		*/
		private String zuizhongValue;



		//级联表 xiangmuguanliyuan
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
			* 电子邮箱
			*/
			private String xiangmuguanliyuanEmail;
			/**
			* 住址
			*/
			private String xiangmuguanliyuanAddress;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 联系电话
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 住址
			*/
			private String yonghuAddress;

	public XiangmuView() {

	}

	public XiangmuView(XiangmuEntity xiangmuEntity) {
		try {
			BeanUtils.copyProperties(this, xiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 项目类型的值
			*/
			public String getXiangmuValue() {
				return xiangmuValue;
			}
			/**
			* 设置： 项目类型的值
			*/
			public void setXiangmuValue(String xiangmuValue) {
				this.xiangmuValue = xiangmuValue;
			}
			/**
			* 获取： 项目管理员审核结果的值
			*/
			public String getXiangmuYesnoValue() {
				return xiangmuYesnoValue;
			}
			/**
			* 设置： 项目管理员审核结果的值
			*/
			public void setXiangmuYesnoValue(String xiangmuYesnoValue) {
				this.xiangmuYesnoValue = xiangmuYesnoValue;
			}
			/**
			* 获取： 专家1的审核结果的值
			*/
			public String getZhuanjia1Value() {
				return zhuanjia1Value;
			}
			/**
			* 设置： 专家1的审核结果的值
			*/
			public void setZhuanjia1Value(String zhuanjia1Value) {
				this.zhuanjia1Value = zhuanjia1Value;
			}
			/**
			* 获取： 专家2的审核结果的值
			*/
			public String getZhuanjia2Value() {
				return zhuanjia2Value;
			}
			/**
			* 设置： 专家2的审核结果的值
			*/
			public void setZhuanjia2Value(String zhuanjia2Value) {
				this.zhuanjia2Value = zhuanjia2Value;
			}
			/**
			* 获取： 专家3的审核结果的值
			*/
			public String getZhuanjia3Value() {
				return zhuanjia3Value;
			}
			/**
			* 设置： 专家3的审核结果的值
			*/
			public void setZhuanjia3Value(String zhuanjia3Value) {
				this.zhuanjia3Value = zhuanjia3Value;
			}
			/**
			* 获取： 最终审核结果的值
			*/
			public String getZuizhongValue() {
				return zuizhongValue;
			}
			/**
			* 设置： 最终审核结果的值
			*/
			public void setZuizhongValue(String zuizhongValue) {
				this.zuizhongValue = zuizhongValue;
			}

















				//级联表的get和set xiangmuguanliyuan
					/**
					* 获取： 项目管理员姓名
					*/
					public String getXiangmuguanliyuanName() {
						return xiangmuguanliyuanName;
					}
					/**
					* 设置： 项目管理员姓名
					*/
					public void setXiangmuguanliyuanName(String xiangmuguanliyuanName) {
						this.xiangmuguanliyuanName = xiangmuguanliyuanName;
					}
					/**
					* 获取： 联系电话
					*/
					public String getXiangmuguanliyuanPhone() {
						return xiangmuguanliyuanPhone;
					}
					/**
					* 设置： 联系电话
					*/
					public void setXiangmuguanliyuanPhone(String xiangmuguanliyuanPhone) {
						this.xiangmuguanliyuanPhone = xiangmuguanliyuanPhone;
					}
					/**
					* 获取： 项目管理员身份证号
					*/
					public String getXiangmuguanliyuanIdNumber() {
						return xiangmuguanliyuanIdNumber;
					}
					/**
					* 设置： 项目管理员身份证号
					*/
					public void setXiangmuguanliyuanIdNumber(String xiangmuguanliyuanIdNumber) {
						this.xiangmuguanliyuanIdNumber = xiangmuguanliyuanIdNumber;
					}
					/**
					* 获取： 头像
					*/
					public String getXiangmuguanliyuanPhoto() {
						return xiangmuguanliyuanPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setXiangmuguanliyuanPhoto(String xiangmuguanliyuanPhoto) {
						this.xiangmuguanliyuanPhoto = xiangmuguanliyuanPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getXiangmuguanliyuanEmail() {
						return xiangmuguanliyuanEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setXiangmuguanliyuanEmail(String xiangmuguanliyuanEmail) {
						this.xiangmuguanliyuanEmail = xiangmuguanliyuanEmail;
					}
					/**
					* 获取： 住址
					*/
					public String getXiangmuguanliyuanAddress() {
						return xiangmuguanliyuanAddress;
					}
					/**
					* 设置： 住址
					*/
					public void setXiangmuguanliyuanAddress(String xiangmuguanliyuanAddress) {
						this.xiangmuguanliyuanAddress = xiangmuguanliyuanAddress;
					}


				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 联系电话
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系电话
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 住址
					*/
					public String getYonghuAddress() {
						return yonghuAddress;
					}
					/**
					* 设置： 住址
					*/
					public void setYonghuAddress(String yonghuAddress) {
						this.yonghuAddress = yonghuAddress;
					}







}
