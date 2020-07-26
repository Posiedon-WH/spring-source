package com.spring.enjoy;

import com.spring.enjoy.app.AppConfig;
import com.spring.enjoy.bean.*;
import com.spring.enjoy.factorybean.MyFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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


//		AopInterface jdkProxyService = (AopInterface)context.getBean("jdkProxyService");
//		jdkProxyService.add();

		F f = (F)context.getBean("f");
		System.out.println(f.toString());
		MyFactoryBean myFactoryBean = new MyFactoryBean();
//		Object myBean = context.getBean("myBeanFactory");
//		Object bean = context.getBean("&myBeanFactory");
//		System.out.println(myBean);
//		System.out.println(bean);
	}
}
