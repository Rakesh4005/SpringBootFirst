package com.cont;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class FirstService {
	
	@Value("${serviceMessage.msg}")
	String value;
	@RequestMapping("/")
	public String myService(){
		return value;
	}

}
