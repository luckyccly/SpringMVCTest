package com.zjp.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	
	/**
	    * 1、RequestMapping 注解用来映射一个请求的url
	    * 2、返回值会通过视图解析器为实际的物理视图，对于InternalResourceViewResolver视图解析器，会做如下的解析：
	    * 通过 prefix+returnValue + 后缀这样的方式来得到实际的物理视图。然后做转发操作。
	    * /WEB-INF/views/success.jsp
	    */
	    @RequestMapping(path = "/helloworld", method = RequestMethod.GET)
	    public String hello() { 
	        System.out.println("Hello World!");
	        return "success";
	    }
}
