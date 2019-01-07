package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Student;
import com.example.demo.pojo.Teacher;
import com.example.demo.service.TeacherService;

@ComponentScan({"com.example.demo.service.TeacherService"})
@RestController
@RequestMapping("/teacher")
public class TeacherController extends BaseController{
    
	@Resource
	private TeacherService teacherService;
	
	@RequestMapping("/login")
	public Object getTeacherInfo()
	{   
		Map<String, Object> teaMap=new HashMap<>();
		teaMap.put("name", "root");
		teaMap.put("id", 1);
		Teacher teacher=teacherService.getTeacherInfoByLogin(teaMap);
		return teacher;
	}
	
	@RequestMapping("/query")
	public Object getStudentInfo()
	{
		String name="root";
		Student student=teacherService.queryStudentInfoByName(name);
		return student;
	}
	
	@RequestMapping("/add")
	public void addStudentInfo()
	{
		Student student=new Student("张三", "男", "245121");
		boolean flag=teacherService.addStudentInfo(student);
		logger.info("是否添加成功:"+flag);
	}
	
	@RequestMapping("/update")
	public void updateStudentInfo()
	{
		Map<String, Object> stuMap=new HashMap<>();
		stuMap.put("name", "root");
		stuMap.put("stuid", "11111");
		boolean flag=teacherService.updateStudentInfoByName(stuMap);
		logger.info("是否更新成功:"+flag);
	}
	@RequestMapping("/delete")
	public void deleteStudentInfo()
	{
		String id="123456";
		boolean flag=teacherService.deleteStudentInfoById(id);
		logger.info("是否删除成功:"+flag);
	}
}
