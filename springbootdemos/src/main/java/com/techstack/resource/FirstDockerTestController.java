package com.techstack.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstDockerTestController {

	@RequestMapping("/greeting")
	public String greeting() {
		return "Welcome for your first DockerBased Rest";
	}
}
