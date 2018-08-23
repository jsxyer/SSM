/**
 * project Name: mvcDemo_cf
 * file Name: TestMyBatisSecondCache.java
 * package Name: com.jsdx.test
 * date: 2018年8月23日 下午7:36:14
 * copyright (c) 2018,Changsha VAROTE Intelligent Technology Co., Ltd
 */
package com.jsdx.test;

import java.util.List;

import org.junit.Test;

import com.jsdx.entity.Waste;
import com.jsdx.service.WasteService;

/**
 * @title: TestMyBatisSecondCache
 * @package: com.jsdx.test
 * @description: 测试MyBatis相关功能
 * @author: chenfa
 * @date: 2018年8月23日 下午7:36:14
 * @version: V1.0
 */
public class TestMyBatis {
	/**
	 * @title: TestSecondCache
	 * @description: 测试二级缓存;多次执行相同的sql应有命中率
	 * @author: chenfa
	 * @date: 2018年8月23日 下午7:41:04 
	 */
	@Test
	public void TestSecondCache(){
		/** 此例用Waste对象做测试 
		 *  二极缓存生效三条件：
		 *  	一、mybatis-config.xml中 <setting name="cacheEnabled" value="true" />
		 *  	二、序列化的实体类需要  implements Serializable
		 *  	三、实体类映射文件需要使用cache 
		 *  	<cache
				  eviction="FIFO"
				  flushInterval="60000"
				  size="512"
				  readOnly="true"/>
		 *  	
		 * **/
		
		/** 二级缓存可跨SqlSession **/
		WasteService service = new WasteService();
		List<Waste> list = service.find();//使用了limit 50
		list=service.find();
		list=service.find();
		list=service.find();
		list=service.find();
		list=service.find();
		for (Waste waste : list) {
			System.out.println(waste);
		}
	}
}
