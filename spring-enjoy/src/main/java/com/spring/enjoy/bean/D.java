package com.spring.enjoy.bean;

import org.springframework.stereotype.Component;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/6/2 0:49
 */
//@Component
public class D {
	private String name;
	public D() {
		System.out.println("====D===init==");
	}

	public void replace(String text){
		System.out.println("i am original======"+text);
	}
	public void replace(int a){
		System.out.println("i am orginal  "+a);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
