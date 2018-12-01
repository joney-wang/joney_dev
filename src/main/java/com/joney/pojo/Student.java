package com.joney.pojo;



/**
 * @author Joney_wang
 *
 */


public class Student {

	private String sid;
	
	private String name;
	
	private int age;
	
	private String birthday;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Student(String sid, String name, int age, String birthday) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", birthday=" + birthday + "]";
	}
	
	
	
}
