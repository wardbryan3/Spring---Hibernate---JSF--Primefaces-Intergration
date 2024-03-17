package com.bww.myteam.dao;

import com.bww.myteam.model.Employee;

public interface EmployeeDao {
	public boolean addEmployee(Employee emp);
	public Employee findEmployeeById(long empId);
}
