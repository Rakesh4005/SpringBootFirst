package com.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	FirstService firstservice;
	@Autowired
	public FirstController(FirstService firstservice){
		this.firstservice=firstservice;
	}
	@Value("${myMessage.msg}")
	public String str;
	
	@RequestMapping("/")
	public String myMethod(){
		return "Hello";
	}
	@RequestMapping("/Value")
	public String getValue(){
		return str;
	}
	
	@RequestMapping("/Service")
	public String fromService(){
		return firstservice.myService();
		
	}

	
}
