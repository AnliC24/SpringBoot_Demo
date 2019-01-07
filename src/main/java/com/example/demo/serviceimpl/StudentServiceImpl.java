package com.example.demo.serviceimpl;

import java.util.Map;

import com.example.demo.pojo.Student;

public interface StudentServiceImpl {
	 //学生登录
	public Student getStudentInfoByLogin(Map<String, Object> stu);
}
