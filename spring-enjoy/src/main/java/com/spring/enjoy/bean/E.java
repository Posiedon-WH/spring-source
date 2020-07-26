package com.spring.enjoy.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/6/5 23:04
 */
@Component
public class E {
	private String name;

	@Autowired
	private C c;

	public E() {
	}

	public E(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
