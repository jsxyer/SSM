package com.jsdx.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @title: Waste_type
 * @package: com.jsdx.entity
 * @description: Waste_type表的实体类
 * @author: chenfa
 * @date: 2018年8月22日 下午3:09:00
 * @version: V1.0
 */
public class Waste_type implements Serializable{
	private static final long serialVersionUID = 5520902730568866673L;
	private Integer id;
	private String name;
	private String code;
	private Date create_date;
	private Date update_date;
	private String del_flag;
	private String create_by;
	
	/** 一对多List 存储类型下所有的废物信息列表 **/
	private List<Waste> wastes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
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
	

	public List<Waste> getWastes() {
		return wastes;
	}

	public void setWastes(List<Waste> wastes) {
		this.wastes = wastes;
	}

	@Override
	public String toString() {
		return "Waste_type [id=" + id + ", name=" + name + ", code=" + code + ", create_date=" + create_date
				+ ", update_date=" + update_date + ", del_flag=" + del_flag + ", create_by=" + create_by + ", wastes="
				+ wastes + "]";
	}

}
