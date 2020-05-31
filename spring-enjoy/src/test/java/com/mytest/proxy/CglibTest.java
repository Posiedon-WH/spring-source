package com.mytest.proxy;

import com.spring.enjoy.proxy.CglibProxyTarget;
import org.junit.Test;
import org.springframework.cglib.proxy.*;

import java.lang.reflect.Method;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/5/30 23:09
 */
public class CglibTest {
	Enhancer enhancer = new Enhancer();

	@Test
	public void testCallbackFilter(){
		System.out.println("dddd");
	}

	@Test
	public void testMethodMethodInterceptor(){

		enhancer.setSuperclass(CglibProxyTarget.class);
		enhancer.setCallback(new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//				System.out.println("object: "+o.toString());//o 已经完成代理的代理对象，toString方法也会拦截，在这里调用会oom
				System.out.println("method: "+method.getName());
				System.out.println("objects: "+objects);
				System.out.println("methodProxy: "+methodProxy);

				return methodProxy.invokeSuper(o,objects);
			}
		});
		CglibProxyTarget proxyTarget = (CglibProxyTarget)enhancer.create();
		proxyTarget.fun1();
		proxyTarget.fun2(90);
	}

	@Test
	public void testDispatch(){
		enhancer.setSuperclass(CglibProxyTarget.class);
		enhancer.setCallback(new Dispatcher() {
			@Override
			public Object loadObject() throws Exception {
				CglibProxyTarget cglibProxyTarget = new CglibProxyTarget();
				return cglibProxyTarget;
			}
		});
		CglibProxyTarget proxyTarget = (CglibProxyTarget)enhancer.create();
		proxyTarget.fun1();
	}

	@Test
	public void testFixedValue(){
		//2.拦截所有方法，返回固定值
		enhancer.setSuperclass(CglibProxyTarget.class);
		enhancer.setCallback(new FixedValue() {
			@Override
			public Object loadObject() throws Exception {
				return "====return fixed value====";
			}
		});
		CglibProxyTarget proxyTarget = (CglibProxyTarget)enhancer.create();
		proxyTarget.fun1();
		proxyTarget.fun2(3);
		//fixedValue ："====return fixed value===="
		System.out.println(proxyTarget.toString());
	}
}
