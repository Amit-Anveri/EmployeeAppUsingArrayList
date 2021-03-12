package com.capg.empapp.service;

import java.util.ArrayList;

import com.capg.empapp.dto.Employee;
import com.capg.empapp.execptions.InvalidEmployeeIdExcption;
import com.capg.empapp.execptions.WrongSalaryException;

public interface IEmployeeService {
	
	public boolean addEmployee(Employee e)throws WrongSalaryException;
	 
	 public boolean editSalaryByEmployeeId(int id,int sal)throws InvalidEmployeeIdExcption;
	 
	 public boolean editExpByEmployeeId(int id,int exp)throws InvalidEmployeeIdExcption;
	 
	 public ArrayList<Employee> getAllEmployees();
	 
	 public ArrayList<Employee> getEmployeeBySalary(int salary);
	 
	 public ArrayList<Employee> getEmployessBySalaryRange(int salaryRangeMin,int salaryRangeMax);

}
