package com.stackroute.samplemvc.repository;

import java.util.List;

import com.stackroute.samplemvc.model.Employee;

public interface EmployeeDAO {

	public void addEmployee(Employee obj);
	public boolean deleteEmp(int id);
	public List<Employee> getallEmployees();
	public Employee findbyEmpid(int id);
	public boolean modifyEmployee(Employee obj);
	
}
