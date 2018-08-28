package com.jsdx.dao;

import java.util.List;
import java.util.Map;

import com.jsdx.entity.Waste_type;

/**
 * 数据持久层接口，因为要用Mybatis框架来操作数据库 所以，只需要创建接口就可以了，接口实现类不需要
 * 以前用JDBC时，就需要创建接口实现类，在接口实现类中写JDBC代码
 * 命名规则：表名 + dao
 */

/**
 * @title: Waste_typeDao
 * @package: com.jsdx.dao
 * @description: Waste_type表的Dao层，提供增、删、改、查的方法
 * @author: chenfa
 * @date: 2018年8月22日 下午3:09:39
 * @version: V1.0
 */
public interface Waste_typeDao {

	/**
	 * @title: find
	 * @description: 返回所有数据
	 * @author: chenfa
	 * @date: 2018年8月22日 下午3:33:25
	 * @return: 分装后的List集合
	 */
	public List<Waste_type> find();

	/**
	 * @title: findById
	 * @description: 返回id对应的数据
	 * @author: chenfa
	 * @date: 2018年8月22日 下午3:33:40
	 * @param id waste_type对象的id
	 * @return: Waste_type对象 
	 */
	public Waste_type findById(int id);

	/**
	 * @title: add
	 * @description: 添加waste_type到数据库
	 * @author: chenfa
	 * @date: 2018年8月22日 下午3:34:06
	 * @param waste_type 传入一个waste_type对象
	 * @return: 受影响的条数 
	 */
	public int add(Waste_type waste_type);

	/**
	 * @title: update
	 * @description: 更新数据
	 * @author: chenfa
	 * @date: 2018年8月22日 下午3:34:45
	 * @param waste_type 传入一个waste_type对象
	 * @return: 受影响的条数
	 */
	public int update(Waste_type waste_type);

	/**
	 * @title: delete
	 * @description: 通过id删除数据
	 * @author: chenfa
	 * @date: 2018年8月22日 下午3:35:28
	 * @param id waste_type对象的id
	 * @return: 受影响的条数
	 */
	public int delete(int id);
	
	public List<Waste_type> getPage(Map<String,Integer> map);
}
