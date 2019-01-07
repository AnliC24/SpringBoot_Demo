package com.example.demo.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.pojo.Student;
import com.example.demo.pojo.Teacher;

@Mapper
public interface TeacherDAO {
    //教师登录
	public Teacher getTeacherInfoByLogin(Map<String, Object> tea);
	//查询一个学生的信息
	public Student queryStudentInfoByName(String name);
	//添加一个学生的信息
	public boolean addStudentInfo(Student stu);
	//修改一个学生的学号
	public boolean updateStudentStuIdByName(Map<String, Object> tea);
	//删除一个学生的信息
	public boolean deleteStudentInfoById(String id);
}
