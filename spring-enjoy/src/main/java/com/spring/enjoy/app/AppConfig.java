package com.spring.enjoy.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan("com.spring.enjoy")
@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class AppConfig {
}
