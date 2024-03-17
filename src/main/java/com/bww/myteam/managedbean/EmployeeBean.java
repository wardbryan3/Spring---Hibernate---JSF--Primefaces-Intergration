package com.bww.myteam.managedbean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bww.myteam.model.Employee;
import com.bww.myteam.service.EmployeeService;

@Component("empBean")
public class EmployeeBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Employee employee= new Employee();
	
	@Autowired
	private EmployeeService empService;
	
	private Employee emp1;
	private Employee emp2;
	
	public EmployeeBean() {
		emp1 = new Employee();
		emp1.setFirstName("Bryan");
		emp1.setLastName("Ward");
		emp2 = new Employee();
		emp2.setFirstName("Victoria");
		emp2.setLastName("Ward");
	}
	
	public void addEmployee() {
		empService.addEmployee(emp1);
		empService.addEmployee(emp2);
		employee= empService.findEmployeeById(emp1.getEmpId());
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
