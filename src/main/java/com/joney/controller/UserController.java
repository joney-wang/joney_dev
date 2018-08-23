package com.joney.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joney.pojo.Resource;
import com.joney.pojo.Response;
import com.joney.pojo.User;

@RestController
@RequestMapping("/v2")
public class UserController {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private Resource resource;
	
	@RequestMapping("/users")
	public Response getUserInfo(){
		User u = new User();
		u.setAge(26);
		u.setBirthday(new Date());
		u.setDesc("good boy");
		u.setName("xiaoming");
		u.setPwd("666666");
		return Response.ok(u);
	}
	
	@RequestMapping("/resource")
	public Response getResource() {
		Resource r = new Resource();
//		r.setLanguage(resource.getLanguage());
//		r.setName(resource.getName());
//		r.setWebsite(resource.getWebsite());
		BeanUtils.copyProperties(resource, r);
		return Response.ok(r);
	}
	
	@PostMapping("/postform")
	public Response postTest(User u){
		System.out.println(u.getName());
		LOGGER.info(u.getName());
		return Response.ok(u);
	}
	
}
