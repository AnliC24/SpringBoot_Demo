package com.example.demo.serviceimpl;


import java.util.Map;

import com.example.demo.pojo.Student;
import com.example.demo.pojo.StudentVue;
import com.example.demo.pojo.Teacher;


public interface TeacherServiceImpl {
   //教师登录
   public Teacher getTeacherInfoByLogin(Map<String, Object> tea);
   
   //查询学生信息，通过name
   public Student queryStudentInfoByName(String name);
   
   //添加一个学生信息
   public boolean addStudentInfo(StudentVue stu);
   
   //修改学生信息--学号
   public boolean updateStudentInfoByName(Map<String, Object> tea);
   
   //删除学生信息--id
   public boolean deleteStudentInfoById(String id);
}
