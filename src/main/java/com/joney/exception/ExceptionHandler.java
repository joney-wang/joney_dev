package com.joney.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class ExceptionHandler {

	public static final String view = "error";
	@org.springframework.web.bind.annotation.ExceptionHandler(value=Exception.class)
	public Object errorHandler(HttpServletRequest request ,
			HttpServletResponse response ,Exception e)throws Exception{
		e.printStackTrace();
		ModelAndView mv = new ModelAndView();
		mv.addObject("exception", e);
		mv.addObject("url", request.getRequestURI());
		mv.setViewName(view);
		
		return mv;
	}	
}
