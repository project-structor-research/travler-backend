package com.springframework.travler.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.travler.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/api/hello")
	@ResponseBody
	public String hello() {
		return helloService.list().toString();
	}
}
