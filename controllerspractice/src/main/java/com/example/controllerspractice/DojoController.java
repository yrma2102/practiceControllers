package com.example.controllerspractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DojoController {
	@GetMapping("/{name}")
	public String getDojo(@PathVariable String name) {
		System.out.println(name);
		String response = "";
		if(name.equals("dojo")) {
			response = "¡El Dojo es increíble!";
		}else if(name.equals("burbank-dojo") ) {
			System.out.println("pasando por brkan");
			response = "El Dojo Burbank está localizado al sur de California";
			
		}else if(name.equals("san-jose") ) {
			response = "El Dojo SJ es el cuartel general";
			
		}else {
			response = "Welcome";
		}
		System.out.println("imprimiendo la response "+ response);
	    return response;
	}
    @RequestMapping("/m/{track}/{module}/{lesson}")
    public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
    	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
    }
}
