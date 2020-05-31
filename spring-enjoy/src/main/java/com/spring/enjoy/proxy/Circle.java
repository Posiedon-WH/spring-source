package com.spring.enjoy.proxy;

import org.junit.Test;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/5/29 0:51
 */
public class Circle implements Shape{
//	@Test
//	public void testself(){
//		System.out.println("eee");
//	}
	@Override
	public void draw() {
		System.out.println("===true draw====");
	}

	@Override
	public void color() {
		System.out.println("====true color====");
	}
}
