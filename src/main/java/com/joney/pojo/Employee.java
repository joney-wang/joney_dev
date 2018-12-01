package com.joney.pojo;

import java.io.Serializable;


public class Employee implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String name;
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(Long id, String name) {
	    super();
	    this.id = id;
	    this.name = name;
	}
	public Employee() {
	    super();
	}


}
