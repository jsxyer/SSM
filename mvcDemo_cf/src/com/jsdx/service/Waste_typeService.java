package com.jsdx.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jsdx.dao.Waste_typeDao;
import com.jsdx.entity.Waste_type;
import com.jsdx.utils.SqlSessionFactoryUtil;

/**
 * @Title: Waste_typeService
 * @Description: Waste_type服务层，为controller提供服务
 * @Company: varote
 * @author: 陈发
 * @create_time: 2018年8月21日 下午12:04:28
 */
public class Waste_typeService {
	/*
	 * 需要MyBatis的API来操作数据
	 */
	public List<Waste_type> find(){
		SqlSession sqlSession = null;
		List<Waste_type> list = null;
		try{
			//调用工具类取到sqlSession对象
			sqlSession = SqlSessionFactoryUtil.getSqlSession();
			//调用getMapper方法获取到数据持久化接口的代理对象，此对象为传入 类 的 子类
			Waste_typeDao dao =  sqlSession.getMapper(Waste_typeDao.class);
			//调用代理对象的方法，会自动去执行数据持久化接口对应的映射文件的指令
			list = dao.find();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			sqlSession.close();
		}
		return list;
	}
}
