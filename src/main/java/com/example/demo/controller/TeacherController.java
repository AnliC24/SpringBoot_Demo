package com.example.demo.controller;

import com.example.demo.pojo.Student;
import com.example.demo.pojo.StudentVue;
import com.example.demo.pojo.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@ComponentScan({"com.example.demo.service.TeacherService"})
@RestController
@RequestMapping("/teacher")
public class TeacherController extends BaseController{
    
	@Resource
	private TeacherService teacherService;
	
	@PostMapping(path="/login")
	public Object getTeacherInfo(@RequestParam String name,@RequestParam String id)
	{   
		Map<String, Object> teaMap=new HashMap<>();
		teaMap.put("name", name);
		teaMap.put("id", id);
		Teacher teacher=teacherService.getTeacherInfoByLogin(teaMap);
		return teacher;
	}
	
	@RequestMapping(path="/query",method=RequestMethod.POST)
	public Object getStudentInfo(@RequestParam String name)
	{
		//String name="root";
		Student student=teacherService.queryStudentInfoByName(name);
		return student;
	}
	
	@RequestMapping(path="/add",method=RequestMethod.POST)
	public boolean addStudentInfo(StudentVue stu)
	{   
		//@RequestBody StudentVue stu
		//@RequestParam String name,@RequestParam String id,@RequestParam String sex
		//@RequestParam String stu_name,@RequestParam String stu_stuid,@RequestParam String stu_sex
		//Student student=new Student(stu_name, stu_sex, stu_stuid);
		//StudentVue stu=new StudentVue(stu_name, stu_sex, stu_stuid);
		boolean flag=teacherService.addStudentInfo(stu);
		logger.info("是否添加成功:"+flag);
		return flag;
	}
	
	@RequestMapping(path="/update",method=RequestMethod.PUT)
	public boolean updateStudentInfo(@RequestParam String name,@RequestParam String id)
	{
		Map<String, Object> stuMap=new HashMap<>();
		stuMap.put("name", name);
		stuMap.put("stuid", id);
		boolean flag=teacherService.updateStudentInfoByName(stuMap);
		logger.info("是否更新成功:"+flag);
		return flag;
	}
	@RequestMapping(path="/delete",method=RequestMethod.DELETE)
	public boolean deleteStudentInfo(@RequestParam String name,@RequestParam String id)
	{
		//String id="123456";
		boolean flag=teacherService.deleteStudentInfoById(id);
		logger.info("是否删除成功:"+flag);
		return flag;
	}
}
