package com.joney.controller;

import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.joney.tasks.TestAsync;

/**
 * @author Joney_wang
 * 测试异步执行和同步的耗时间情况
 * 异步相当于在并发执行，同步相当于正常的顺序执行。
 */
@Controller
@RequestMapping("/async")
@ResponseBody
public class TestAsyncController {

	@Autowired
	private TestAsync ta;
	
	@RequestMapping("time")
	@GetMapping
	public String test() throws Exception{
		
		long start = System.currentTimeMillis();
		Future<Boolean> doAsync1 = ta.doAsync1();
		Future<Boolean> doAsync2 = ta.doAsync2();
		Future<Boolean> doAsync3 = ta.doAsync3();
		
		while(!doAsync1.isDone()||!doAsync2.isDone()||!doAsync3.isDone()){
			
			if(doAsync1.isDone()&&doAsync2.isDone()&&doAsync3.isDone()){
				break;
			}
		}
		
		long end = System.currentTimeMillis();
		String time = "总共耗时："+(end-start)+"毫秒";
		System.out.println("*************"+time+"************");
		return time;
	}
	
}
