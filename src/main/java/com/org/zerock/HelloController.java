package com.org.zerock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

   @GetMapping("/hello")
   public String hello() {
      return "hello";
   }
   
   @GetMapping("/sanghk")
   public String sang() {
	   return "sanghk";
   }
   @GetMapping("/hoho")
   public String hoho() {
	   return "hoho";
   }
}
