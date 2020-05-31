package com.spring.enjoy.proxy;

/**
 * 需要代理的类
 * @Author: Posiedon.wh
 * @Date: 2020/5/30 17:06
 */
public class CglibProxyTarget {
	public void fun1(){
		System.out.println("===fun1====");
	}

	public String fun2(int a){
		System.out.println("===fun2====arg:"+a);
		return "===fun2==="+a;
	}
}
