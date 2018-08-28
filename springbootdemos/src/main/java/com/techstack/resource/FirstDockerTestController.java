package com.techstack.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstDockerTestController {

	@RequestMapping("/dockerTest")
	public String dockerTest() {
		return "Welcome to DockerTest Team";
	}
	
	@RequestMapping("/dockerTest2")
	public String dockerTest2() {
		return "2nd test";
	}
}
