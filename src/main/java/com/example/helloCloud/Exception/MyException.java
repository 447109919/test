package com.example.helloCloud.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyException {

	@ResponseBody
	@ExceptionHandler(value=java.lang.Exception.class)
	public Map<String,Object> myException(Exception ex){
		Map<String,Object> map=new HashMap<>();
		map.put("code", 500);
		map.put("msg", "程序错误");
		return map;
	}
}
