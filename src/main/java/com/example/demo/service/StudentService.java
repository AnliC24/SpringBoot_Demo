package com.example.demo.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDAO;
import com.example.demo.pojo.Student;
import com.example.demo.serviceimpl.StudentServiceImpl;

@ComponentScan({"com.example.demo.dao.StudentDAO"})
@Service
public class StudentService implements StudentServiceImpl{
    @Resource
	private StudentDAO stuDAO;
	@Override
	public Student getStudentInfoByLogin(Map<String, Object> stu) {
		// TODO Auto-generated method stub
		return stuDAO.getStudentInfoByLogin(stu);
	}
	
}
