package com.spring.enjoy.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.spring.enjoy")
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
}
