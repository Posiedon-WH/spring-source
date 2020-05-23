package com.spring.enjoy.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/5/11 23:24
 */
@Component
public class B {
//	@Autowired
	public B(C c){
		System.out.println("+++++B default");
	}
}
