/**
 * project Name: mvcDemo_cf
 * file Name: WasteController.java
 * package Name: com.jsdx.controller
 * date: 2018年8月23日 上午9:31:19
 * copyright (c) 2018,Changsha VAROTE Intelligent Technology Co., Ltd
 */
package com.jsdx.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsdx.entity.Waste;
import com.jsdx.service.WasteService;

/**
 * @title: WasteController
 * @package: com.jsdx.controller
 * @description: Waste控制层
 * @author: chenfa
 * @date: 2018年8月23日 上午9:31:19
 * @version: V1.0
 */

/**
 * 此注解表示这是一个控制器类
 * SpringMVC框架会自动扫描这个类
 * 		<context:component-scan base-package="com.jsdx.controller"></context:component-scan>
 * 把这个类创建一个对象，存储在SpringMVC框架的容器中
 */
@Controller
//是一个URL映射，通过URL能访问到这个类中
@RequestMapping("/waste")
public class WasteController {
	//要访问此方法的URL：waste/list
	@RequestMapping("/list")
	public String list(Model model){
		//调用底层方法取数据
		List<Waste> list = new WasteService().find();
		model.addAttribute("wastes", list);
		//把数据传递到指定的视图中去
		//返回的是视图名称，视图解析器会为这个视图名称加上前缀和后缀，得到视图的具体路径
		
		/*
		 * 如果一次传送多个对象，可以使用Map传送
		 */
		return "wasteList";
	}
}
