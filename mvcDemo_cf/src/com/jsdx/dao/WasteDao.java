/**
 * project Name: mvcDemo_cf
 * file Name: WasteDao.java
 * package Name: com.jsdx.dao
 * date: 2018年8月23日 上午9:26:44
 * copyright (c) 2018,Changsha VAROTE Intelligent Technology Co., Ltd
 */
package com.jsdx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

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
	
	//此为注解配置，注解配置和映射文件配置会有冲突
	//@Select("select * from waste")
	public List<Waste> find();

	/**
	 * @title: findByTypeId
	 * @description: 根据废物类型的编号查询所有的废物信息
	 * @author: chenfa
	 * @date: 2018年8月23日 上午11:24:20
	 * @param id
	 *            废物类型id
	 * @return 封装后的List集合
	 */
	public List<Waste> findByTypeId(int id);

	/**
	 * @title: findByLike
	 * @description: 废物的模糊查询
	 * @author: chenfa
	 * @date: 2018年8月24日 下午2:54:41
	 * @param condition
	 * @return 封装后的List集合
	 */
	public List<Waste> findByLike(String condition);
}
