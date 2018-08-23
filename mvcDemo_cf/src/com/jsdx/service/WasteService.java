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
public class WasteService {
	/**
	 * @title: find
	 * @description: 调用dao层find方法
	 * @author: chenfa
	 * @date: 2018年8月23日 上午10:39:51
	 * @return 返回封装后的List集合
	 */
	public List<Waste> find(){
		SqlSession sqlSession = null;
		List<Waste> list = null;
		try {
			sqlSession = SqlSessionFactoryUtil.getSqlSession();
			WasteDao dao = sqlSession.getMapper(WasteDao.class);
			list = dao.find();
		} finally {
			sqlSession.close();
		}
		return list;
	}
}
