package com.hugui.dto;

/**
@date : 2017年8月29日
@author : hugui
@description : TODO
**/

public class User {

	String name;
	Integer age;
	
	public User(){
		
	}
	
	public User(String name, Integer age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}

