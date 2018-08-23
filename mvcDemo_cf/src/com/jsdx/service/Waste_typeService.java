package com.jsdx.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jsdx.dao.Waste_typeDao;
import com.jsdx.entity.Waste_type;
import com.jsdx.utils.SqlSessionFactoryUtil;

/**
 * @title: Waste_typeService
 * @package: com.jsdx.service
 * @description: Waste_type服务层，为controller提供服务
 * @author: chenfa
 * @date: 2018年8月22日 下午3:46:56
 * @version: V1.0
 */
public class Waste_typeService {
	/*
	 * 需要MyBatis的API来操作数据
	 */
	/**
	 * @title: find
	 * @description: 调用dao层find方法
	 * @author: chenfa
	 * @date: 2018年8月22日 下午3:47:22
	 * @return: 封装后的List集合
	 */
	public List<Waste_type> find() {
		/** 使用此对象操作数据库 **/
		SqlSession sqlSession = null;
		/** 接收返回的结果集 **/
		List<Waste_type> list = null;
		try {
			// 调用工具类取到sqlSession对象
			sqlSession = SqlSessionFactoryUtil.getSqlSession();
			// 调用getMapper方法获取到数据持久化接口的代理对象，此对象为传入 类 的 子类
			Waste_typeDao dao = sqlSession.getMapper(Waste_typeDao.class);
			// 调用代理对象的方法，会自动去执行数据持久化接口对应的映射文件的指令
			list = dao.find();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sqlSession.close();
		}
		return list;
	}

	/**
	 * @title: findById
	 * @description: 调用dao层findById方法
	 * @author: chenfa
	 * @date: 2018年8月23日 上午9:08:59
	 * @param id waste_type对象的id
	 * @return Waste_type对象
	 */
	public Waste_type findById(int id) {
		/** 使用此对象操作数据库 **/
		SqlSession sqlSession = null;
		/** 接收返回的结果集 **/
		Waste_type waste_type = null;
		try {
			// 调用工具类取到sqlSession对象
			sqlSession = SqlSessionFactoryUtil.getSqlSession();
			// 调用getMapper方法获取到数据持久化接口的代理对象，此对象为传入 类 的 子类
			Waste_typeDao dao = sqlSession.getMapper(Waste_typeDao.class);
			// 调用代理对象的方法，会自动去执行数据持久化接口对应的映射文件的指令
			waste_type = dao.findById(id);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sqlSession.close();
		}
		return waste_type;
	}

	/**
	 * @title: add
	 * @description: 添加一条新数据到waste_type表
	 * @author: chenfa
	 * @date: 2018年8月22日 下午3:56:48
	 * @param waste_type
	 *             waste_type对象
	 * @return: 受影响的条数
	 */
	public int add(Waste_type waste_type) {
		/** 使用此对象操作数据库 **/
		SqlSession sqlSession = null;
		/** 受影响的条数 **/
		int count = 0;
		try {
			sqlSession = SqlSessionFactoryUtil.getSqlSession();// 调用工具类获得SqlSession对象操作数据库
			Waste_typeDao dao = sqlSession.getMapper(Waste_typeDao.class);// 取代理对象
			count = dao.add(waste_type);// 调用方法，获得受到影响的行数
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		return count;
	}

	/**
	 * @title: update
	 * @description: 更新数据库记录
	 * @author: chenfa
	 * @date: 2018年8月22日 下午4:25:00
	 * @param waste_type
	 *             waste_type对象
	 * @return: 受影响的条数
	 */
	public int update(Waste_type waste_type) {
		/** 使用此对象操作数据库 **/
		SqlSession sqlSession = null;
		/** 受影响的条数 **/
		int count = 0;
		try {
			sqlSession = SqlSessionFactoryUtil.getSqlSession();
			Waste_typeDao dao = sqlSession.getMapper(Waste_typeDao.class);
			count = dao.update(waste_type);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		return count;
	}

	/**
	 * @title: delete
	 * @description: 到用dao层delete方法
	 * @author: chenfa
	 * @date: 2018年8月22日 下午4:31:40
	 * @param id
	 *             waste_type对象的id
	 * @return: 受影响的条数
	 */
	public int delete(int id) {
		/** 使用此对象操作数据库 **/
		SqlSession sqlSession = null;
		/** 受影响的条数 **/
		int count = 0;
		try {
			sqlSession = SqlSessionFactoryUtil.getSqlSession();// 调用工具类获得SqlSession对象操作数据库
			Waste_typeDao dao = sqlSession.getMapper(Waste_typeDao.class);// 取代理对象
			count = dao.delete(id);// 调用方法，获得受到影响的行数
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		return count;
	}
}
