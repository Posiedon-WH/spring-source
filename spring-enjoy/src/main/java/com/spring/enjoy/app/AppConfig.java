package com.spring.enjoy.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan("com.spring.enjoy")
@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement
//@EnableWebMvc
public class AppConfig {
}
