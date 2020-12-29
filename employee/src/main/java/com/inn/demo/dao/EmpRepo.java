package com.inn.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inn.demo.employee.Emp;

@Repository
public interface EmpRepo extends CrudRepository<Emp, Integer>{
	

}
