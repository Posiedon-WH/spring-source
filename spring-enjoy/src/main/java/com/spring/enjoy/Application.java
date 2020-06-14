package com.spring.enjoy;

import com.spring.enjoy.aop.UsageTracked;
import com.spring.enjoy.app.AppConfig;
import com.spring.enjoy.bean.A;
import com.spring.enjoy.bean.D;
import com.spring.enjoy.bean.E;
import com.spring.enjoy.service.AopInterface;
import com.spring.enjoy.service.AopService;
import com.spring.enjoy.service.JdkProxyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author weihai 2020/4/21 23:05
 **/

public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		D d =(D)context.getBean("d");
//		System.out.println(d.getName());
		/*context.getBean(AopService.class).test1();
		context.getBean(AopService.class).test2();
		try {
			context.getBean(AopService.class).test3();
		} catch (Exception e) {
		}*/

//		AopService aopService = context.getBean(AopService.class);
//		aopService.test1();
//		UsageTracked aopService = (UsageTracked) context.getBean("aopService");
//		aopService.adviceAddFunc();
//		AopService aopService = (AopService) context.getBean("aopService");
//		aopService.test5();

//		A a = (A)context.getBean("a");
//		a.testAop();


		AopInterface jdkProxyService = (AopInterface)context.getBean("jdkProxyService");
//		JdkProxyService jdkProxyService = (JdkProxyService)context.getBean("AopInterface");
		jdkProxyService.add();
	}
}
