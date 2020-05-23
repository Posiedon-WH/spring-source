package com.spring.enjoy.app;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;



import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Set;

//public class App implements ServletContainerInitializer {
public class MyWebApplicationInitializer implements WebApplicationInitializer {


	//完成web.xml功能-----tomcat启动时调用
//	public void xx(ServletContext servletContext){
//		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
//		//扫描bean
//		webApplicationContext.register(AppConfig.class);
//		webApplicationContext.refresh();
//
//		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
//
//		ServletRegistration.Dynamic registration = servletContext.addServlet("app", dispatcherServlet);
//		registration.setLoadOnStartup(1);
//		registration.addMapping("*.do");
//
//	}

/*	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		//扫描bean
		webApplicationContext.register(AppConfig.class);
		webApplicationContext.refresh();

		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

		ServletRegistration.Dynamic registration = ctx.addServlet("app", dispatcherServlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("*.do");

		System.out.println("---------servlet初始化完成----------");
	}*/

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		//扫描bean
		webApplicationContext.register(AppConfig.class);
		webApplicationContext.setServletContext(servletContext);
		webApplicationContext.refresh();

		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

		ServletRegistration.Dynamic registration = servletContext.addServlet("boot", dispatcherServlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("*.do");
		System.out.println("---------servlet初始化完成----------");
	}
}
