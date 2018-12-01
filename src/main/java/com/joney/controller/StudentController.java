package com.joney.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.joney.pojo.Student;
import com.joney.service.StudentService;
import com.joney.utils.JsonResult;
import com.joney.utils.ResultUtil;

@RestController
@ResponseBody
@RequestMapping("/bs/v1")
public class StudentController {

	@Autowired
	private StudentService stus;
	
	@GetMapping("/students")
	public JsonResult<List<Student>> queryStudents(){
		
		List<Student> studnets = stus.queryStudnets();
		
		return ResultUtil.success(studnets);
	} 
}
