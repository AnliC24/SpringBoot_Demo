package com.example.demo.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.pojo.Student;

@Mapper
public interface StudentDAO {
    //学生登录,获取学生信息
	public Student getStudentInfoByLogin(Map<String, Object> stu);
}
