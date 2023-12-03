package com.entity.model;

import com.entity.KeshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 科室信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-08-01 07:19:43
 */
public class KeshixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科室名称
	 */
	
	private String keshimingcheng;
		
	/**
	 * 科室分类
	 */
	
	private String keshifenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 科室位置
	 */
	
	private String keshiweizhi;
		
	/**
	 * 医生工号
	 */
	
	private String yishenggonghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 挂号费
	 */
	
	private Integer guahaofei;
				
	
	/**
	 * 设置：科室名称
	 */
	 
	public void setKeshimingcheng(String keshimingcheng) {
		this.keshimingcheng = keshimingcheng;
	}
	
	/**
	 * 获取：科室名称
	 */
	public String getKeshimingcheng() {
		return keshimingcheng;
	}
				
	
	/**
	 * 设置：科室分类
	 */
	 
	public void setKeshifenlei(String keshifenlei) {
		this.keshifenlei = keshifenlei;
	}
	
	/**
	 * 获取：科室分类
	 */
	public String getKeshifenlei() {
		return keshifenlei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：科室位置
	 */
	 
	public void setKeshiweizhi(String keshiweizhi) {
		this.keshiweizhi = keshiweizhi;
	}
	
	/**
	 * 获取：科室位置
	 */
	public String getKeshiweizhi() {
		return keshiweizhi;
	}
				
	
	/**
	 * 设置：医生工号
	 */
	 
	public void setYishenggonghao(String yishenggonghao) {
		this.yishenggonghao = yishenggonghao;
	}
	
	/**
	 * 获取：医生工号
	 */
	public String getYishenggonghao() {
		return yishenggonghao;
	}
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：挂号费
	 */
	 
	public void setGuahaofei(Integer guahaofei) {
		this.guahaofei = guahaofei;
	}
	
	/**
	 * 获取：挂号费
	 */
	public Integer getGuahaofei() {
		return guahaofei;
	}
			
}
