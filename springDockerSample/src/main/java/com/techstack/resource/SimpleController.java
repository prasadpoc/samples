package com.techstack.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class SimpleController.
 * 
 * @author prasadt
 * @version 1.0
 */
@RestController
public class SimpleController {

	/**
	 * Docker test.
	 *
	 * @return the string
	 */
	@GetMapping("/dockerTest")
	public String dockerTest() {
		return ("success");
	}

}
