package com.example.demo.pojo;

import java.io.Serializable;

public class StudentVue implements Serializable{
	private String stu_name;
    private String stu_sex;
    private String stu_stuid;
    

	public StudentVue() {
		super();
	}
	public StudentVue(String stu_name, String stu_sex, String stu_stuid) {
		super();
		this.stu_name = stu_name;
		this.stu_sex = stu_sex;
		this.stu_stuid = stu_stuid;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_sex() {
		return stu_sex;
	}
	public void setStu_sex(String stu_sex) {
		this.stu_sex = stu_sex;
	}
	public String getStu_stuid() {
		return stu_stuid;
	}
	public void setStu_stuid(String stu_stuid) {
		this.stu_stuid = stu_stuid;
	}
    
    
}
