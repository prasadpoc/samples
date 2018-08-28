package com.techstack.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondDockerTestController {

	@RequestMapping("/SeconddockerTest")
	public String dockerTest() {
		return "Welcome to DockerTest!!!";
	}

}
