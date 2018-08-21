package com.jsdx.dao;

import java.util.List;


/**
 * 数据持久层接口，因为要用Mybatis框架来操作数据库
 * 所以，只需要创建接口就可以了，接口实现类不需要
 * 以前用JDBC时，就需要创建接口实现类，在接口实现类中写JDBC代码
 * @author 陈发
 * 
 * 命名规则：表名 + dao
 */
public interface Waste_type {
	//在数据持久化接口中，就是一些操作数据的方法，增、删、改、查的方法比较多
	public List<Waste_type> find();
	public int add(Waste_type waste_type);
	public int update(Waste_type waste_type);
	public int delete(int id);
}
