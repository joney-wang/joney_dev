package com.joney.utils;

import java.util.Date;

public class ResultUtil {

	public static <T> JsonResult<T> success(T data){
		
		JsonResult<T> jr = new JsonResult<>();
		jr.setCode("200");
		jr.setMsg("seccess");
		jr.setTime(new Date().getTime());
		jr.setData(data);
		
		return jr;
	}
	
	public static <T> JsonResult<T> error(T data){
		
		JsonResult<T> jr = new JsonResult<>();
		jr.setCode("101");
		jr.setMsg("error");
		jr.setTime(new Date().getTime());
		jr.setData(null);
		
		return jr;
	}
	
	public static <T> JsonResult<T> success(){
		
		JsonResult<T> jr = new JsonResult<>();
		jr.setCode("200");
		jr.setMsg("seccess");
		jr.setTime(new Date().getTime());
		
		return jr;
	}
}
