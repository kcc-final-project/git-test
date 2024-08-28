package com.org.zerock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChaewonController {
	
	@GetMapping("/chaewonController")
	public String chae() {
		 return "chaewon";
	}
}
