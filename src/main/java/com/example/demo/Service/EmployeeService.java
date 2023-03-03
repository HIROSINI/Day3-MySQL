package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.Repository.EmployeeRepo;



@Service
public class EmployeeService 
{
	@Autowired
	EmployeeRepo emRepo;
	
	public EmployeeEntity saveDetails(EmployeeEntity e)
	{
		return emRepo.save(e);
	}
	public List<EmployeeEntity>getDetails()
	{
		return emRepo.findAll();
	}
	public Optional<EmployeeEntity> getDetails(int id)
	{
		return emRepo.findById(id);
	}
}
