package com.entity.view;

import com.entity.ShenherizhiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 审核日志
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shenherizhi")
public class ShenherizhiView extends ShenherizhiEntity implements Serializable {
    private static final long serialVersionUID = 1L;




	public ShenherizhiView() {

	}

	public ShenherizhiView(ShenherizhiEntity shenherizhiEntity) {
		try {
			BeanUtils.copyProperties(this, shenherizhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













}
