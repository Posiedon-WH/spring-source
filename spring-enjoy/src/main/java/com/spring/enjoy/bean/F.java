package com.spring.enjoy.bean;

/**
 * @Author: Posiedon.wh
 * @Date: 2020/6/16 0:31
 */
public class F {
	private String name;

	public F() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "F{" +
				"name='" + name + '\'' +
				'}';
	}
}
