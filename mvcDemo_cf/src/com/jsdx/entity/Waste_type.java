package com.jsdx.entity;

/**
 * @Title: Waste_type
 * @Description: Waste_type���ʵ����
 * @Company: varote
 * @author: �·�
 * @create_time: 2018��8��21�� ����12:02:10
 */
public class Waste_type {
	private int type_id;
	private String name;
	private String code;

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Waste_type [type_id=" + type_id + ", name=" + name + ", code=" + code + "]";
	}
}
