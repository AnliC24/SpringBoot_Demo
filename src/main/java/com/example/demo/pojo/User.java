package com.example.demo.pojo;



import java.util.Date;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;




public class User {
   
	private String name;
	@JsonIgnore
	private String password;
	private Integer age;
	@JsonInclude(Include.NON_NULL)
	private String desc;
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss a",locale="zh",timezone="GMT+8")
	private Date birthday;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
    
}
