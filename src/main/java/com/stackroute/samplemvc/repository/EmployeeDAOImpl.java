package com.stackroute.samplemvc.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stackroute.samplemvc.model.Employee;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO{
	
	
	@Autowired
	SessionFactory sessfact;

	public void addEmployee(Employee obj) {
		
		sessfact.getCurrentSession().save(obj);
		
	}

	public boolean deleteEmp(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Employee> getallEmployees() {

	return sessfact.getCurrentSession().createQuery("from Employee").list();
		 
	}

	public Employee findbyEmpid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean modifyEmployee(Employee obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
