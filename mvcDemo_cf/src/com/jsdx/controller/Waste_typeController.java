package com.jsdx.controller;

import java.util.List;

import com.jsdx.entity.Waste_type;
import com.jsdx.service.Waste_typeService;

/**
 * @Title: Waste_typeController
 * @Description: ���ڽ��տͻ��ε����󣬺�̨����󣬷��ظ��ͻ���
 * @Company: varote
 * @author: �·�
 * @create_time: 2018��8��21�� ����12:03:46
 */
public class Waste_typeController {
	//��Ϊֻ��ѧϰMyBatis��ܣ�����Ҫ�õ�
	public static void main(String[] args) {
		//����ҵ���ķ���
		List<Waste_type> list = new Waste_typeService().find();
		for (Waste_type waste_type : list) {
			System.out.println(waste_type);
		}
	}
}
