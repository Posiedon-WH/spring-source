package com.spring.enjoy.aop;

public class DefaultUsageTracked implements UsageTracked{
	@Override
	public void adviceAddFunc() {
		System.out.println("=====adviceAddFunc====");
	}
}
