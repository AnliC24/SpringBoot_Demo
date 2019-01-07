package com.example.demo.pojo;

import java.io.Serializable;

public class Teacher implements Serializable{
    
	private Integer tea_id;
	private String tea_name;
	private String tea_position;
	
	
	public Teacher(Integer tea_id, String tea_name, String tea_position) {
		super();
		this.tea_id = tea_id;
		this.tea_name = tea_name;
		this.tea_position = tea_position;
	}
	public Teacher(String tea_name, String tea_position) {
		super();
		this.tea_name = tea_name;
		this.tea_position = tea_position;
	}
	public Integer getTea_id() {
		return tea_id;
	}
	public void setTea_id(Integer tea_id) {
		this.tea_id = tea_id;
	}
	public String getTea_name() {
		return tea_name;
	}
	public void setTea_name(String tea_name) {
		this.tea_name = tea_name;
	}
	public String getTea_position() {
		return tea_position;
	}
	public void setTea_position(String tea_position) {
		this.tea_position = tea_position;
	}
	
	
}
