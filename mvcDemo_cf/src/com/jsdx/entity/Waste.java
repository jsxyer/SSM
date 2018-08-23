/**
 * project Name: mvcDemo_cf
 * file Name: Waste.java
 * package Name: com.jsdx.entity
 * date: 2018年8月23日 上午9:23:09
 * copyright (c) 2018,Changsha VAROTE Intelligent Technology Co., Ltd
 */
package com.jsdx.entity;

import java.util.Date;

/**
 * @title: Waste
 * @package: com.jsdx.entity
 * @description: 废物实体类
 * @author: chenfa
 * @date: 2018年8月23日 上午9:23:09
 * @version: V1.0
 */
public class Waste {
	private int id;
	private int waste_type_id;
	private String name;
	/** 用废物类型的对象存放废物类型 **/
	private Waste_type waste_type;
	private String hazardous_characteristics;
	private int industry_from_id;
	private Date create_date;
	private Date update_date;
	private String del_flag;
	private String create_by;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWaste_type_id() {
		return waste_type_id;
	}

	public void setWaste_type_id(int waste_type_id) {
		this.waste_type_id = waste_type_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Waste_type getWaste_type() {
		return waste_type;
	}

	public void setWaste_type(Waste_type waste_type) {
		this.waste_type = waste_type;
	}

	public String getHazardous_characteristics() {
		return hazardous_characteristics;
	}

	public void setHazardous_characteristics(String hazardous_characteristics) {
		this.hazardous_characteristics = hazardous_characteristics;
	}

	public int getIndustry_from_id() {
		return industry_from_id;
	}

	public void setIndustry_from_id(int industry_from_id) {
		this.industry_from_id = industry_from_id;
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

	@Override
	public String toString() {
		return "Waste [id=" + id + ", waste_type_id=" + waste_type_id + ", name=" + name + ", waste_type=" + waste_type
				+ ", hazardous_characteristics=" + hazardous_characteristics + ", industry_from_id=" + industry_from_id
				+ ", create_date=" + create_date + ", update_date=" + update_date + ", del_flag=" + del_flag
				+ ", create_by=" + create_by + "]";
	}

}
