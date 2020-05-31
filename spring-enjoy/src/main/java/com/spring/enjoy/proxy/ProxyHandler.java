package com.spring.enjoy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/5/29 0:53
 */
public class ProxyHandler implements InvocationHandler {
	private Circle proxied;

	public ProxyHandler(Circle proxied) {
		this.proxied = proxied;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("====proxy: "+proxy.getClass()+",method: "+method+",args: "+args);

		return method.invoke(proxied,args);
	}
}
