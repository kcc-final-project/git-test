package com.org.zerock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sanghk {
	@GetMapping("/sh")
	public String sanghk() {
		return "sanghk";
	}
}
