package com.entity.view;

import com.entity.ShiyongdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 使用订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-19 12:20:14
 */
@TableName("shiyongdingdan")
public class ShiyongdingdanView  extends ShiyongdingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyongdingdanView(){
	}
 
 	public ShiyongdingdanView(ShiyongdingdanEntity shiyongdingdanEntity){
 	try {
			BeanUtils.copyProperties(this, shiyongdingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
