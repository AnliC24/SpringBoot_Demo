package com.example.demo.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.TeacherDAO;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.StudentVue;
import com.example.demo.pojo.Teacher;
import com.example.demo.serviceimpl.TeacherServiceImpl;

@ComponentScan({"com.example.demo.dao.TeacherDAO"})
@Service
public class TeacherService implements TeacherServiceImpl{
    
	@Resource
	private TeacherDAO teaDAO;
	
	@Override
	public Teacher getTeacherInfoByLogin(Map<String, Object> tea) {
		// TODO Auto-generated method stub
		return teaDAO.getTeacherInfoByLogin(tea);
	}

	@Override
	public Student queryStudentInfoByName(String name) {
		// TODO Auto-generated method stub
		return teaDAO.queryStudentInfoByName(name);
	}
    
	@Transactional
	@Override
	public boolean addStudentInfo(StudentVue stu) {
		// TODO Auto-generated method stub
		return teaDAO.addStudentInfo(stu);
	}
    
	@Transactional
	@Override
	public boolean updateStudentInfoByName(Map<String, Object> tea) {
		// TODO Auto-generated method stub
		return teaDAO.updateStudentStuIdByName(tea);
	}
    
	@Transactional
	@Override
	public boolean deleteStudentInfoById(String id) {
		// TODO Auto-generated method stub
		return teaDAO.deleteStudentInfoById(id);
	}

}
