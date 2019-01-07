package com.example.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @param Configuration 代表这个类是一个资源文件类，类似于Controller，提供给扫描机识别该类的作用
 * @param prefix是用来识别.properties文件内的属性
 * @param PropertySource 资源的地址
 * */
@Configuration
@ConfigurationProperties(prefix="com.example.demoResource")
@PropertySource(value="classpath:resource.properties")
public class resource {
    
	private String name;
	private String website;
	private String language;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
}
