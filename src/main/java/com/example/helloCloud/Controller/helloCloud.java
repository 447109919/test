package com.example.helloCloud.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloCloud {

	private String msg="hello world";
	
	@RequestMapping("/hello")
	public String showMsg() {
		return msg;
	}
}
