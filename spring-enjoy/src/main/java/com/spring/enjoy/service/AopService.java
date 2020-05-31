package com.spring.enjoy.service;

import com.spring.enjoy.bean.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AopService {

	@Autowired
	A a;
	public void test1(){
		System.out.println("====aopService.test1()====");
	}

	public Object test2(){
		System.out.println("====aopService.test2()====return object====");
		return "reval";
	}

	public void test3() throws Exception {
		System.out.println("====aopService.test3()====throw Exception====");
		throw new Exception("posiedon ex");
	}

	public void test4(){
		System.out.println("====aopService.test4()====around====");
	}

	public void test5(){
		System.out.println("====aopService.test5()====introduction===");
	}
}
