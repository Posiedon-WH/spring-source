package com.spring.enjoy.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/6/2 0:47
 */
//@Component
public class SelfBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition d = beanFactory.getBeanDefinition("d");
		if(d!=null){
			d.setAttribute("name","hello");
			d.setDependsOn("b");
		}
	}
}
