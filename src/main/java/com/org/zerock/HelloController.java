package com.org.zerock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

   @GetMapping("/hello")
   public String hello() {
      return "hello";
   }
   
   @GetMapping("/hello/cheolwon")
   public String helloWCheolwon() {
	   return "hello Cheolwon";
   }
   
}
