package com.spring.enjoy.web;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.apache.tomcat.util.http.parser.Host;

public class SpringApplication {

	public static void run() throws LifecycleException {
		Tomcat tomcat = new Tomcat();
//		tomcat.setPort(9070);
		tomcat.addWebapp("/boot","F:\\temp");
		tomcat.start();
		tomcat.getServer().await();
	}
}
