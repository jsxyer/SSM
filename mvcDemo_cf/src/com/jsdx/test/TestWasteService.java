/**
 * project Name: mvcDemo_cf
 * file Name: TestWasteService.java
 * package Name: com.jsdx.test
 * date: 2018年8月23日 上午9:40:16
 * copyright (c) 2018,Changsha VAROTE Intelligent Technology Co., Ltd
 */
package com.jsdx.test;

import java.util.List;

import org.junit.Test;

import com.jsdx.entity.Waste;
import com.jsdx.service.WasteService;

/**
 * @title: TestWasteService
 * @package: com.jsdx.test
 * @description: 测试Waste服务层接口
 * @author: chenfa
 * @date: 2018年8月23日 上午9:40:16
 * @version: V1.0
 */
public class TestWasteService {
	/**
	 * @title: find
	 * @description: 查找所有的数据;测试通过
	 * @author: chenfa
	 * @date: 2018年8月23日 上午10:40:24 
	 */
	@Test
	public void find(){
		WasteService service = new WasteService();
		List<Waste> list = service.find();
		for (Waste waste : list) {
			System.out.println(waste);
		}
	}
}
