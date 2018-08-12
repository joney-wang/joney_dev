package com.joney.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
//@RestController  //不能用
@Controller
//@RequestMapping("/v3")
public class ThymeleafController {

	@RequestMapping("/index")
	public String index(){
		
		return "thymeleaf/index";
	}
	@RequestMapping("center")
	public String center(ModelMap map) {
		map.addAttribute("bee", "嗡嗡叫~~~~~");
		return "thymeleaf/center/center";
	}
}
