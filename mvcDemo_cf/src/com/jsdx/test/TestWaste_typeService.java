/**
 * project Name: mvcDemo_cf
 * file Name: Test2.java
 * package Name: com.jsdx.text
 * date: 2018年8月22日 下午4:44:30
 * copyright (c) 2018,Changsha VAROTE Intelligent Technology Co., Ltd
 */
package com.jsdx.test;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.jsdx.entity.Waste_type;
import com.jsdx.service.Waste_typeService;

/**
 * @title: Test2
 * @package: com.jsdx.text
 * @description: 测试waste_typeService服务功能 ;测试顺序为find、add、findById、delete、update
 * @author: chenfa
 * @date: 2018年8月22日 下午4:44:30
 * @version: V1.0
 */
public class TestWaste_typeService {
	/**
	 * @title: find
	 * @description: 查找所有的数据;测试通过
	 * @author: chenfa
	 * @date: 2018年8月22日 下午4:46:54
	 */
	@Test
	public void find() {
		System.out.println("-----start-----test-----find------------------------------");
		Waste_typeService service = new Waste_typeService();
		List<Waste_type> list = service.find();
		for (Waste_type waste_type : list) {
			System.out.println(waste_type);
		}
	}

	/**
	 * @title: add
	 * @description: 添加一条记录到数据库;测试通过
	 * @author: chenfa
	 * @date: 2018年8月22日 下午7:23:41
	 */
	@Test
	public void add() {
		System.out.println("-----start-----test-----add------------------------------");
		/** 构建Waste_type对象，并为不能为空的列赋值 **/
		Waste_type waste_type = new Waste_type();
		waste_type.setName("医疗废物");
		waste_type.setCode("HW50");
		waste_type.setCreate_date(new Date());
		waste_type.setUpdate_date(new Date());
		waste_type.setDel_flag("0");
		waste_type.setCreate_by("chenfa");
		/** 调用服务层方法 **/
		Waste_typeService service = new Waste_typeService();
		int count = service.add(waste_type);
		if (count > 0) {
			int id = waste_type.getId();
			System.out.println("添加成功,最新ID为:" + id);
		} else {
			System.out.println("添加失败");
		}
	}

	/**
	 * @title: findById
	 * @description: 通过id查询记录;测试通过
	 * @author: chenfa
	 * @date: 2018年8月22日 下午4:59:28
	 */
	@Test
	public void findById() {
		System.out.println("-----start-----test-----findById------------------------------");
		int id = 30;
		Waste_typeService service = new Waste_typeService();
		Waste_type waste_type = service.findById(id);
		System.out.println(waste_type);
	}

	/**
	 * @title: delete
	 * @description: 删除指定ID的行;测试通过
	 * @author: chenfa
	 * @date: 2018年8月22日 下午7:26:53
	 */
	@Test
	public void delete() {
		System.out.println("-----start-----test-----delete------------------------------");
		Waste_typeService service = new Waste_typeService();
		int count = service.delete(50);
		if (count > 0) {
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}
	}

	/**
	 * @title: update
	 * @description: 改变数据库中的记录;
	 * @author: chenfa
	 * @date: 2018年8月22日 下午7:33:08
	 */
	@Test
	public void update() {
		System.out.println("-----start-----test-----update------------------------------");
		int id = 52;
		/** 构建Waste_type对象，并为不能为空的列赋值 **/
		Waste_type waste_type = new Waste_type();
		waste_type.setId(id);
		waste_type.setName("医疗废物");
		waste_type.setCode("HW50");
		waste_type.setCreate_date(new Date());
		waste_type.setUpdate_date(new Date());
		waste_type.setDel_flag("0");
		waste_type.setCreate_by("admin");
		/** 调用服务层方法 **/
		Waste_typeService service = new Waste_typeService();
		int count = service.update(waste_type);
		if (count > 0) {
			System.out.println("更新成功");
		} else {
			System.out.println("更新失败");
		}
	}

	// @Test
	public void testDateTime() {
		System.out.println("-----start-----test-----testDateTime------------------------------");
		/**
		 * 此处测试的存在因为之前实体类使用的是java.sql.Time对象，new这个对象只有时间，没有日期，存在插入数据不匹配
		 * 已更换使用java.util.Date对象
		 */
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("此为非格式化的java.util.Date:" + new Date(System.currentTimeMillis()));
		System.out.println("此为格式化后的java.util.Date:" + simpleDateFormat.format(new Date()));
		System.out.println("此为java.sql.Time:" + new Time(System.currentTimeMillis()));
		System.out.println("此为java.sql.Date:" + new java.sql.Date(System.currentTimeMillis()));
		/**
		 * 以下是结果样例： 此为非格式化的java.util.Date:Wed Aug 22 19:39:11 CST 2018
		 * 此为格式化后的java.util.Date:2018-39-22 07:39:11 此为java.sql.Time:19:40:00
		 * 此为java.sql.Date:2018-08-22
		 */
	}
}
