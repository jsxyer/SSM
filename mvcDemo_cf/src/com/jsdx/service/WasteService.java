/**
 * project Name: mvcDemo_cf
 * file Name: WasteService.java
 * package Name: com.jsdx.service
 * date: 2018年8月23日 上午9:27:54
 * copyright (c) 2018,Changsha VAROTE Intelligent Technology Co., Ltd
 */
package com.jsdx.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jsdx.dao.WasteDao;
import com.jsdx.entity.Waste;
import com.jsdx.utils.SqlSessionFactoryUtil;

/**
 * @title: WasteService
 * @package: com.jsdx.service
 * @description: Waste服务层
 * @author: chenfa
 * @date: 2018年8月23日 上午9:27:54
 * @version: V1.0
 */
public class WasteService implements WasteDao{
	/**
	 * @title: find
	 * @description: 调用dao层find方法
	 * @author: chenfa
	 * @date: 2018年8月23日 上午10:39:51
	 * @return 返回封装后的List集合
	 */
	public List<Waste> find() {
		SqlSession sqlSession = null;
		List<Waste> list = null;
		try {
			sqlSession = SqlSessionFactoryUtil.getSqlSession();//调用工具类，获取SqlSession对象
			WasteDao dao = sqlSession.getMapper(WasteDao.class);//获得代理对象
			list = dao.find();//执行代理对象的find方法，会执行映射文件中与方法名匹配的SQL指令
			//使用RowBounds实现分页的效果，此方式只适用于注解，不适用于代理对象
//			RowBounds rowBounds = new RowBounds(1,10);
//			list = sqlSession.selectList("com.jsdx.dao.WasteDao.find",null,rowBounds);
		} finally {
			sqlSession.close();//关闭SqlSession对象
		}
		return list;
	}

	/**
	 * @title: findByTypeId
	 * @description: 通过ID查找信息
	 * @author: chenfa
	 * @date: 2018年8月23日 下午2:21:09
	 * @param id
	 *            Waste的ID
	 * @return 符合ID的List集合
	 */
	public List<Waste> findByTypeId(int id) {
		SqlSession sqlSession = null;
		List<Waste> list = null;
		try {
			sqlSession = SqlSessionFactoryUtil.getSqlSession();
			WasteDao dao = sqlSession.getMapper(WasteDao.class);
			list = dao.findByTypeId(id);
		} finally {
			sqlSession.close();
		}
		return list;
	}

	/**
	 * @title: findByLike
	 * @description: 调用dao层方法
	 * @author: chenfa
	 * @date: 2018年8月24日 下午2:59:12
	 * @param condition like模糊查询的条件
	 * @return 符合ID的List集合
	 */
	public List<Waste> findByLike(String condition) {
		SqlSession sqlSession = null;
		List<Waste> list = null;
		try {
			sqlSession = SqlSessionFactoryUtil.getSqlSession();
			WasteDao dao = sqlSession.getMapper(WasteDao.class);
			list = dao.findByLike(condition);
		} finally {
			sqlSession.close();
		}
		return list;
	}
}
