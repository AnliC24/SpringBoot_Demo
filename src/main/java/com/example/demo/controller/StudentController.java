package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;

@ComponentScan({"com.example.demo.service.StudentService"})
@RestController
@RequestMapping("/student")
public class StudentController extends BaseController{
	@Resource
    private StudentService stuService;
	@RequestMapping(path="/login")
	public Object getStudentInfo(@RequestParam String name,@RequestParam String id)
	{   
		Map<String, Object> stuMap=new HashMap<>();
		stuMap.put("name", name);
		stuMap.put("id", id);
		Student student=stuService.getStudentInfoByLogin(stuMap);
		return student;
	}
}
