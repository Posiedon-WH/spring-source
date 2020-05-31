package com.mytest.proxy;

import com.spring.enjoy.proxy.Circle;
import com.spring.enjoy.proxy.ProxyHandler;
import com.spring.enjoy.proxy.Shape;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/5/29 1:03
 */
public class ProxyTest {

	@Test
	public void test(){
		Circle circle = new Circle();
		Shape o = (Shape) Proxy.newProxyInstance(Shape.class.getClassLoader(), circle.getClass().getInterfaces(), new ProxyHandler(circle));
		o.draw();
		o.color();
	}
}
