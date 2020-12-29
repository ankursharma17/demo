package com.inn.demo.restimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inn.demo.employee.Emp;
import com.inn.demo.irest.EmpController;
import com.inn.demo.service.EmpService;

@RestController
public class EmpRestImpl implements EmpController {

	@Autowired
	EmpService empService;

	public Emp addEmployee(@RequestBody Emp emp) {
		return empService.addEmployee(emp);
	}

	public List<Emp> getEmployee() {
		return (List<Emp>) empService.getEmployee();
	}

	public Optional<Emp> employee(@RequestBody @PathVariable("eid") int eid) {

		return empService.employee(eid);
	}

	public String DeleteEmployee(@RequestBody @PathVariable("eid") int eid) {
		return empService.DeleteEmployee(eid);
	}

	public Emp UpdateEmployee(@RequestBody Emp emp) {
		return empService.UpdateEmployee(emp);

	}

}
