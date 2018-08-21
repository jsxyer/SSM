package com.jsdx.entity;

/**
 * @Title: Waste_type
 * @Description: Waste_type表的实体类
 * @Company: varote
 * @author: 陈发
 * @create_time: 2018年8月21日 下午12:02:10
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
