package com.org.zerock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

   @GetMapping("/hello")
   public String hello() {
      return "hello";
   }
  
   @GetMapping("/hellohyunmin")
   public String hellohyunmin() {
      return "hellohyunmin";
   }

   @GetMapping("/sanghk")
   public String sang() {
	   return "sanghk";
   }
   @GetMapping("/hoho")
   public String hoho() {
	   return "hoho";
   }
   @GetMapping("/hello/cheolwon")
   public String helloWCheolwon() {
	   return "hello Cheolwon";
   }
   
   @GetMapping("/chaewon")
   public String tech() {
	   return "chaewon";
   }

}
