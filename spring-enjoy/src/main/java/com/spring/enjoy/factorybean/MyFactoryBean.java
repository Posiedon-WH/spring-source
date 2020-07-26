package com.spring.enjoy.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Service;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/7/26 11:35
 */
@Service
public class MyFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new MyBean();
	}

	@Override
	public Class<?> getObjectType() {
		return MyBean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
