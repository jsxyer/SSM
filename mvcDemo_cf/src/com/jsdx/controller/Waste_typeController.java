package com.jsdx.controller;

import java.util.List;

import com.jsdx.entity.Waste_type;
import com.jsdx.service.Waste_typeService;

/**
 * @Title: Waste_typeController
 * @Description: 用于接收客户段的请求，后台处理后，返回给客户段
 * @Company: varote
 * @author: 陈发
 * @create_time: 2018年8月21日 下午12:03:46
 */
public class Waste_typeController {
	//因为只是学习MyBatis框架，不需要用到
	public static void main(String[] args) {
		//调用业务层的方法
		List<Waste_type> list = new Waste_typeService().find();
		for (Waste_type waste_type : list) {
			System.out.println(waste_type);
		}
	}
}
