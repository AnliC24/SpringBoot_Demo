package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.pojo.*;

@RestController
@RequestMapping("/resource")
public class ResourceController {
    
	@Autowired
	private resource resource;
	
	@RequestMapping("/getResource")
	public Object getResource(){
	  resource newRes=new resource();
	  newRes=resource;
	  System.out.println(newRes.getName());
	  return newRes;
	}
}
