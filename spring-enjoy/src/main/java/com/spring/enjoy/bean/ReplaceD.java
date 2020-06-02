package com.spring.enjoy.bean;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/6/2 22:56
 */
@Component
public class ReplaceD implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("i am replace method");
		return null;
	}
}
