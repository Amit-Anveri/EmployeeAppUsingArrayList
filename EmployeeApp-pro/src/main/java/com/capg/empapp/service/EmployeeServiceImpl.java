package com.capg.empapp.service;

import java.util.ArrayList;

import com.capg.empapp.dao.EmployeeDAOImpl;
import com.capg.empapp.dao.IEmployeeDAO;
import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.execptions.InvalidEmployeeIdExcption;
import com.capg.empapp.execptions.WrongSalaryException;

public class EmployeeServiceImpl implements IEmployeeService {
	// Animal a = new Dog();
	IEmployeeDAO dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeDAOImpl();
	}

	public boolean addEmployee(Employee e) throws WrongSalaryException {

		// System.out.println(" ------------>> inside service "+e);

		if (e.getSalary() > 50000) {
			throw new WrongSalaryException();
		} else
			return dao.addEmployee(e);

	}

	public ArrayList<Employee> getAllEmployees() {

		return dao.getAllEmployees();
	}

	// ================================================================================

	public boolean editSalaryByEmployeeId(int id, int salary) throws InvalidEmployeeIdExcption {
		if (dao.editSalaryByEmployeeId(id, salary))
			return true;
		else
			return false;
	}

	public boolean editExpByEmployeeId(int id, int exp) throws InvalidEmployeeIdExcption {
		if (dao.editExpByEmployeeId(id, exp))
			return true;
		else
			return false;
	}

	public ArrayList<Employee> getEmployeeBySalary(int salary) {
		ArrayList<Employee> empsWithGivenSalary = dao.getEmployeeBySalary(salary);

		return empsWithGivenSalary;

	}

	public ArrayList<Employee> getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		ArrayList<Employee> empsInGivenRange = dao.getEmployessBySalaryRange(salaryRangeMin, salaryRangeMax);
		return empsInGivenRange;
	}

}
