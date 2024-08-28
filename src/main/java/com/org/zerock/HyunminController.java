package com.org.zerock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HyunminController {

   @GetMapping("/hyunmin")
   public String hello() {
      return "hello";
   }
}
