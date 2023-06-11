package com.cts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.binding.Emp;

@RestController
public class EmpRestController {
	@GetMapping("/")
	public Emp getEmp() {
		Emp e=new Emp();
		e.setId(101);
		e.setName("Siva");
		e.setEmail("java@gmail.com");
		return e;
	}

}
