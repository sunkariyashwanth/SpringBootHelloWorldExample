/**
 * 
 */
package com.javalog.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pkumatekar
 *
 */
@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String printHelloWorld() {
		return "HelloWorld!!!";
	}
}
