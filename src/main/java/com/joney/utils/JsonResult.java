package com.joney.utils;


public class JsonResult<T> {

	private String code;
	
	private String msg;
	
	private Long time;
	
	private T data;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public JsonResult(String code, String msg, Long time, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.time = time;
		this.data = data;
	}

	public JsonResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "JsonResult [code=" + code + ", msg=" + msg + ", time=" + time + ", data=" + data + "]";
	}

	
}
