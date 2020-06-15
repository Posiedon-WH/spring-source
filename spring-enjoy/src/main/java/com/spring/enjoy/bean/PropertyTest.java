package com.spring.enjoy.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/6/16 0:22
 */
@PropertySource("classpath:core.properties")
@Component
public class PropertyTest {

	@Value("${wh.name}")
	private String name;

	@Value("${wh.age}")
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PropertyTest{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				'}';
	}

	@Bean("f")
	public F getF(){
		System.out.println("====name===="+name);
		F f = new F();
		f.setName(name);
		return f;
	}
}
