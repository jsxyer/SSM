package com.jsdx.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @title: SqlSessionFactoryUtil
 * @package: com.jsdx.utils
 * @description: 这是一个工具类，向外公开一个方法，获取SqlSession对象的方法
 * @author: chenfa
 * @date: 2018年8月23日 上午9:13:32
 * @version: V1.0
 */
public class SqlSessionFactoryUtil {
	static InputStream inputStream = null;
	static SqlSessionFactory sqlSessionFactory = null;
	
	static Object lock = new Object();
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
	 * 此方法依赖 配置文件 mybatis-config.xml
	 */
	private static SqlSessionFactory getSqlSessionFactory() {
		//此方法为懒汉式单例模式，存在线程不安全
		/*
		 * 解决方案:
		 * 			加锁 synchronized ，锁方法或变量
		 */
		
		if(sqlSessionFactory == null){	//写到这一层：懒汉式单例模式
			synchronized (lock) {	//只写到这一层存在新能问题
				if (sqlSessionFactory == null) {	//只写到这一层存在线程不安全问题：饿汉单例模式
					sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				}
			}
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
