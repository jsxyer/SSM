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
import com.jsdx.entity.Waste_type;
import com.jsdx.service.WasteService;
import com.jsdx.service.Waste_typeService;

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
	// @Test
	public void find() {
		WasteService service = new WasteService();
		List<Waste> list = service.find();
		for (Waste waste : list) {
			System.out.println(waste);
		}
	}

	// @Test
	/**
	 * @title: findById
	 * @description: 通过ID查询记录;测试通过
	 * @author: chenfa
	 * @date: 2018年8月23日 下午2:22:49
	 */
	public void findById() {
		WasteService service = new WasteService();
		List<Waste> list = service.findByTypeId(1);
		for (Waste waste : list) {
			System.out.println(waste);
		}
	}

	/**
	 * @title: findByIdAll
	 * @description: 获得所有的废物类型，输出每种类型的废物信息;测试通过
	 * @author: chenfa
	 * @date: 2018年8月23日 下午2:23:12
	 */
	@Test
	public void findByIdAll() {
		List<Waste_type> waste_typeServices = new Waste_typeService().find();
		for (Waste_type waste_type : waste_typeServices) {
			System.out.println("------------    Waste_type_id: " + waste_type.getId() + "  -----------------");
			System.out.println(waste_type);
			for (Waste waste : waste_type.getWastes()) {
				System.out.println(waste);
			}
			System.out.println();
		}
	}
}
