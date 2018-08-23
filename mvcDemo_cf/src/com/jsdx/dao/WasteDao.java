/**
 * project Name: mvcDemo_cf
 * file Name: WasteDao.java
 * package Name: com.jsdx.dao
 * date: 2018年8月23日 上午9:26:44
 * copyright (c) 2018,Changsha VAROTE Intelligent Technology Co., Ltd
 */
package com.jsdx.dao;

import java.util.List;

import com.jsdx.entity.Waste;

/**
 * @title: WasteDao
 * @package: com.jsdx.dao
 * @description: Waste表接口
 * @author: chenfa
 * @date: 2018年8月23日 上午9:26:44
 * @version: V1.0
 */
public interface WasteDao {
	/**
	 * @title: find
	 * @description: 查找所有的数据
	 * @author: chenfa
	 * @date: 2018年8月23日 上午10:37:39
	 * @return 封装后的List集合
	 */
	public List<Waste> find();
	/**
	 * @title: findByTypeId
	 * @description: 根据废物类型的编号查询所有的废物信息
	 * @author: chenfa
	 * @date: 2018年8月23日 上午11:24:20
	 * @param id 废物类型id
	 * @return 
	 */
	public List<Waste> findByTypeId(int id);
}
