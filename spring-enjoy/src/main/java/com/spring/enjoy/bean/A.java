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
	AopService aopService;

	public A(){
		System.out.println("++++init A");
	}

//	@Autowired(required = false)
//	public A(B b){
//		System.out.println("+++++instant B");
//	}
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void testAop(){
		aopService.test1();
	}
}
