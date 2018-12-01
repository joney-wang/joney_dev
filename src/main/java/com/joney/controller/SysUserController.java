package com.joney.controller;

import java.util.Date;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.joney.pojo.Response;
import com.joney.pojo.SysUser;
import com.joney.service.UserService;

@Controller
@RequestMapping("/sysUser/v2")
@ResponseBody
public class SysUserController {

	@Autowired
	UserService us;
	
	@RequestMapping("/save")
	@PostMapping
	public Response saveUser() throws Exception{
		
		SysUser su = new SysUser();
		//ID自动生成器随机
		su.setId(Sid.nextShort());
		su.setUsername("tom - "+new Date());
		su.setPassword("666666 - "+new Date());
		su.setAddress("abcdefghjkkkkkk");
		su.setNickname("nick888");
		su.setAge(26);
		su.setCity("西安市");
		su.setDistrict("未央区");
		su.setProvince("陕西省");
		su.setFaceImage("d:/app/my");
		su.setIsDelete(0);
		su.setAuthSalt("salt7777777777");
		su.setSex(2);
		su.setJob(4);
		su.setLastLoginIp("100.119.214.15");
		su.setLastLoginTime(new Date());
		su.setRegistTime(new Date());
		
		us.saveUser(su);
		return Response.ok("添加系统管理员成功");
	}
}
