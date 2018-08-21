package com.jsdx.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @Title: SqlSessionFactoryUtil
 * @Description: ����һ�������࣬���⹫��һ����������ȡSqlSession����ķ���
 * @Company: varote
 * @author: �·�
 * @create_time: 2018��8��21�� ����4:02:38
 */
public class SqlSessionFactoryUtil {
	static InputStream inputStream = null;
	static SqlSessionFactory sqlSessionFactory = null;
	/*
	 * ��̬��������Ǽ����������ļ����������ʼ��γ�һ��������
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
	 * ����SqlSessionFactory����������ֻ��һ�����������ɵ���ģʽ
	 */
	private static SqlSessionFactory getSqlSessionFactory() {
		if (sqlSessionFactory == null) {
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}
		return sqlSessionFactory;
	}

	/*
	 * ���⹫��һ������������SqlSession���󣬴˶�������SqlSessionFactory����������
	 */
	public static SqlSession getSqlSession() {
		/*
		 * �����������openSession()�����ɴ���SqlSession����
		 */
		return getSqlSessionFactory().openSession();
	}

}
