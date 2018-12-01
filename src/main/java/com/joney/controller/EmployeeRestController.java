package com.joney.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.joney.pojo.Employee;
import com.joney.pojo.Response;

@RestController
@RequestMapping("/employee/v1")
public class EmployeeRestController {

	@RequestMapping("/emp")
	@GetMapping
	public Response getList(){
		List<Employee> l = new ArrayList<Employee>();
	//	Employee emp = new Employee();
		
		l.add(new Employee(1001L,"jack"));
		l.add(new Employee(1002L,"rose"));
		l.add(new Employee(1003L,"tom"));
		return Response.ok(l);
	}
}
