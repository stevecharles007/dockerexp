package com.webappexp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/myFirstWebApp")
public class WebController {
	
	@GetMapping(value="/getResult")
	public String getResult() {
		return "outwitting the devil";
	}

}
