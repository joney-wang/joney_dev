package com.joney.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joney.pojo.User;
//@RestController  //不能用
@Controller
//@RequestMapping("/v3")
public class ThymeleafController {

	public static final Logger LOGGER = LoggerFactory.getLogger(ThymeleafController.class);
	
	@RequestMapping("/index")
	public String index(){
		
		return "thymeleaf/index";
	}
	@RequestMapping("center")
	public String center(ModelMap map) {
		map.addAttribute("bee", "嗡嗡叫~~~~~");
		return "thymeleaf/center/center";
	}
	
	@RequestMapping("/test111")
	public String test111(ModelMap map) {
		User u = new User();
		u.setAge(26);
		u.setBirthday(new Date());
		u.setDesc("<font color='green'><b>hello joney</b></font>");
		u.setName("王二小");
		u.setPwd("666666");
		map.addAttribute("user", u);
		return "thymeleaf/test";
	}
	
	@RequestMapping("/test")
	public String test(ModelMap map) {
		User u = new User();
		u.setAge(26);
		u.setBirthday(new Date());
		u.setDesc("<font color='green'><b>hello joney</b></font>");
		u.setName("xiaoming");
		u.setPwd("666666");
		
		User u1 = new User();
		u1.setAge(22);
		u1.setBirthday(new Date());
		u1.setDesc("<font color='red'><b>hello joney</b></font>");
		u1.setName("哈哈");
		u1.setPwd("222222");
		
		User u2 = new User();
		u2.setAge(21);
		u2.setBirthday(new Date());
		u2.setDesc("<font color='blue'><b>hello joney</b></font>");
		u2.setName("胡凯莉");
		u2.setPwd("444444");
		
		List<User> l = new ArrayList<>();
		l.add(u);
		l.add(u1);
		l.add(u2);
		
		map.addAttribute("userList", l);
		return "thymeleaf/test";
	}
	
	@PostMapping("/postform")
	public String postTest(User u){
		LOGGER.error("年龄：{},{}", u.getPwd(),u.getName());
		LOGGER.warn("年龄：{},{}", u.getPwd(),u.getName());
		LOGGER.info("姓名：{}",u.getName());
		LOGGER.debug("年龄：{},{}", u.getPwd(),u.getName());
		return "/thymeleaf/index";
	}
}

