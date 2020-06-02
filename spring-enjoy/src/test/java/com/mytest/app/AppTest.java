package com.mytest.app;

import com.spring.enjoy.bean.D;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/6/2 23:13
 */
public class AppTest {
	@Test
	public void springXml(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		D bean = context.getBean(D.class);
		bean.replace(33);
		bean.replace("hello");
	}
}
