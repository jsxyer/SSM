package com.jsdx.dao;

import java.util.List;


/**
 * ���ݳ־ò�ӿڣ���ΪҪ��Mybatis������������ݿ�
 * ���ԣ�ֻ��Ҫ�����ӿھͿ����ˣ��ӿ�ʵ���಻��Ҫ
 * ��ǰ��JDBCʱ������Ҫ�����ӿ�ʵ���࣬�ڽӿ�ʵ������дJDBC����
 * @author �·�
 * 
 * �������򣺱��� + dao
 */
public interface Waste_type {
	//�����ݳ־û��ӿ��У�����һЩ�������ݵķ���������ɾ���ġ���ķ����Ƚ϶�
	public List<Waste_type> find();
	public int add(Waste_type waste_type);
	public int update(Waste_type waste_type);
	public int delete(int id);
}
