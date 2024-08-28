package com.org.zerock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CheolwonController {

	@GetMapping("/cheolwon")
	public String cheolwon() {
		return "cheolwon";
	}
	
}
