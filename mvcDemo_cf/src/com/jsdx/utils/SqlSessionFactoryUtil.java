package com.jsdx.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @Title: SqlSessionFactoryUtil
 * @Description: 这是一个工具类，向外公开一个方法，获取SqlSession对象的方法
 * @Company: varote
 * @author: 陈发
 * @create_time: 2018年8月21日 下午4:02:38
 */
public class SqlSessionFactoryUtil {
	static InputStream inputStream = null;
	static SqlSessionFactory sqlSessionFactory = null;
	/*
	 * 静态快的作用是加载主配置文件，把配置问价形成一个输入流
	 */
	static {
		String resource = "config/mybatis-config.xml";
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/*
	 * 创建SqlSessionFactory工厂，工厂只有一个，所以做成单例模式
	 */
	private static SqlSessionFactory getSqlSessionFactory() {
		if (sqlSessionFactory == null) {
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}
		return sqlSessionFactory;
	}

	/*
	 * 向外公开一个方法，返回SqlSession对象，此对象依赖SqlSessionFactory工厂来创建
	 */
	public static SqlSession getSqlSession() {
		/*
		 * 工厂对象调用openSession()方法可创建SqlSession对象
		 */
		return getSqlSessionFactory().openSession();
	}

}
