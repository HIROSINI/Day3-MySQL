package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeService emService;
	
	@PostMapping("/addDetails")
	public EmployeeEntity addInfo(@RequestBody EmployeeEntity st)
	{
		return emService.saveDetails(st);
	}
	
	@GetMapping("showDetails")
	public List<EmployeeEntity> fetchDetails()
	{
		return emService.getDetails();
	}
	@GetMapping("showDetails")
	public Optional<EmployeeEntity> fetchDetails(@PathVariable int id)
	{
		return emService.getDetails(id);
	}
}
