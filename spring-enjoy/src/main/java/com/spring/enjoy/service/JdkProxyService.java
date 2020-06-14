package com.spring.enjoy.service;

import org.springframework.stereotype.Service;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/6/14 10:45
 */
@Service
public class JdkProxyService  implements AopInterface{
	@Override
	public void add() {
		System.out.println("========jdk proxy=====");
	}
}
