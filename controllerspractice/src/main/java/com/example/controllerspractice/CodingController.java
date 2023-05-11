package com.example.controllerspractice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
    public String coding(){
      return "¡Hola Coding Dojo!";
    }
    @RequestMapping("/python")
    public String python(){
      return "¡Python/Django fue increíble!";
    }
    @RequestMapping("/java")
    public String world(){
      return "¡Java/Spring es mejor!";
    }
    
}
