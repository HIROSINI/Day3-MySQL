package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer>
{

}
