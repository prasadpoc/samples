package com.techstack.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	/**
	 * Note: if we forgot @PathVariable value passed on url will not mapped to local variable. 
	 * 
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	@RequestMapping(value = "hello/{firstName}/{lastName}", method = RequestMethod.GET)
	public String hello(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		return "welcome to " + firstName + " " + lastName;
	}

}
