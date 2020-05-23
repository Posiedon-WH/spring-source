package com.spring.enjoy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@RequestMapping("/index.do")
	@ResponseBody
	public void index(){
		System.out.println("--------indexController--------");
	}
}
