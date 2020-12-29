package com.inn.demo.irest;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inn.demo.employee.Emp;

public interface EmpController {

	@PostMapping(value="/addEmployee")
	public Emp addEmployee(@RequestBody Emp emp);

	@GetMapping("/getEmployee")
	public List<Emp> getEmployee();

	@RequestMapping("/employee/{eid}")
	public Optional<Emp> employee(@RequestBody @PathVariable("eid") int eid);

	@DeleteMapping("/deleteEmployee/{eid}")
	public String DeleteEmployee(@RequestBody @PathVariable("eid") int eid);

	@PutMapping("/updateEmployee")
	public Emp UpdateEmployee(@RequestBody Emp emp);

}
