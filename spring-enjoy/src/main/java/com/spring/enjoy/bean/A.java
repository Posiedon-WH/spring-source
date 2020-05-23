package com.spring.enjoy.bean;

import com.spring.enjoy.service.AopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author weihai 2020/4/21 23:09
 **/
@Component
public class A {
//	public A(){
//		System.out.println("default");
//	}
//
//	public A(AopService service){
//		System.out.println("service");
//	}

	@Autowired
	public A(AopService service,B b){
		System.out.println("++++service and b");
	}

//	@Autowired(required = false)
	public A(B b){
		System.out.println("+++++instant B");
	}
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
