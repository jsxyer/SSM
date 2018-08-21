package com.jsdx.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jsdx.dao.Waste_typeDao;
import com.jsdx.entity.Waste_type;
import com.jsdx.utils.SqlSessionFactoryUtil;

/**
 * @Title: Waste_typeService
 * @Description: Waste_type����㣬Ϊcontroller�ṩ����
 * @Company: varote
 * @author: �·�
 * @create_time: 2018��8��21�� ����12:04:28
 */
public class Waste_typeService {
	/*
	 * ��ҪMyBatis��API����������
	 */
	public List<Waste_type> find(){
		SqlSession sqlSession = null;
		List<Waste_type> list = null;
		try{
			//���ù�����ȡ��sqlSession����
			sqlSession = SqlSessionFactoryUtil.getSqlSession();
			//����getMapper������ȡ�����ݳ־û��ӿڵĴ������
			Waste_typeDao dao =  sqlSession.getMapper(Waste_typeDao.class);
			//���ô������ķ��������Զ�ȥִ�����ݳ־û��ӿڶ�Ӧ��ӳ���ļ���ָ��
			list = dao.find();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			sqlSession.close();
		}
		return list;
	}
}
