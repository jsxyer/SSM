package com.jsdx.entity;

import java.sql.Time;

/**
 * @Title: Waste_type
 * @Description: Waste_type表的实体类
 * @Company: varote
 * @author: 陈发
 * @create_time: 2018年8月21日 下午12:02:10
 */
public class Waste_type {
	private int id;
	private String name;
	private String code;
	private Time create_date;
	private Time update_date;
	private String del_flag;
	private String create_by;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Time getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Time create_date) {
		this.create_date = create_date;
	}

	public Time getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Time update_date) {
		this.update_date = update_date;
	}

	public String getDel_flag() {
		return del_flag;
	}

	public void setDel_flag(String del_flag) {
		this.del_flag = del_flag;
	}

	public String getCreate_by() {
		return create_by;
	}

	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}

	@Override
	public String toString() {
		return "Waste_type [id=" + id + ", name=" + name + ", code=" + code + ", create_date=" + create_date
				+ ", update_date=" + update_date + ", del_flag=" + del_flag + ", create_by=" + create_by + "]";
	}
}
