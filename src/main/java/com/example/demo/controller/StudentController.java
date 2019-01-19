package com.example.demo.controller;

import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@ComponentScan({"com.example.demo.service.StudentService"})
@RestController
@RequestMapping("/student")
public class StudentController extends BaseController{
	@Resource
    private StudentService stuService;
	@PostMapping(path="/login")
	public Object getStudentInfo(@RequestParam String name,@RequestParam String id)
	{   
		Map<String, Object> stuMap=new HashMap<>();
		stuMap.put("name", name);
		stuMap.put("id", id);
		Student student=stuService.getStudentInfoByLogin(stuMap);
		return student;
	}
}
