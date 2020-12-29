package com.inn.demo.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//@Component
@Entity
@Table(name="employee")
public class Emp {

	@Id
	@Column(name="eid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="salary")
	private float salary;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	
	
}
