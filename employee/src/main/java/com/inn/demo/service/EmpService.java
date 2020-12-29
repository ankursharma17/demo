package com.inn.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.inn.demo.dao.EmpRepo;
import com.inn.demo.employee.Emp;

@Service
public class EmpService {

	@Autowired
	EmpRepo repo;

	public Emp addEmployee(@RequestBody Emp emp) {
		repo.save(emp);
		return emp;
	}

	public List<Emp> getEmployee() {

		return (List<Emp>) repo.findAll();
	}

	public Optional<Emp> employee(int eid) {

		return repo.findById(eid);
	}

	public String DeleteEmployee(int eid) {

		repo.deleteById(eid);
		return "deleted";
	}

	public Emp UpdateEmployee(Emp emp) {
	
		if(repo.findById(emp.getEid()).isPresent())
		{
			repo.save(emp);
		}
		return emp;
	}

}
