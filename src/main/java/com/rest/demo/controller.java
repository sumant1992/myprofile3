package com.rest.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.demo.model.Model;

@RestController
public class controller {

	@Autowired
	Modelrepo repo;
	
	@PostMapping("/add")
	public Model input(@RequestBody Model model) {
		return repo.save(model);
	}
	
	@GetMapping("/all")
	public List<Model> input() {
		return repo.findAll();
	}
}
