package com.capg.empapp.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.execptions.InvalidEmployeeIdExcption;
import com.capg.empapp.execptions.WrongSalaryException;

public class EmployeeDAOImpl implements IEmployeeDAO {
	Scanner sc = new Scanner(System.in);
	Employee e = new Employee();

	public boolean addEmployee(Employee e) throws WrongSalaryException {
		// SQL insert into employee ......

		// System.out.println(" =====>> DAO Impl employee "+e);
		return EmployeeDB.addEmployee(e);
	}

	public ArrayList<Employee> getAllEmployees() {
		return EmployeeDB.employees;
	}

	// ============================================================

	public boolean editSalaryByEmployeeId(int id, int salary) throws InvalidEmployeeIdExcption {
		// TODO Auto-generated method stub
		for (Employee e : EmployeeDB.employees) {
			if (e.getEmployeeId() == id) {
				e.setSalary(salary);
				return true;
			}

		}
		return false;
	}

	public boolean editExpByEmployeeId(int id, int exp) throws InvalidEmployeeIdExcption {
		// TODO Auto-generated method stub
		for (Employee e : EmployeeDB.employees) {
			if (e.getEmployeeId() == id) {
				e.setExp(exp);
				return true;
			}

		}
		return false;
	}

	public ArrayList<Employee> getEmployeeBySalary(int salary) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empsalary = new ArrayList<Employee>();
		for (Employee e : EmployeeDB.employees) {
			if (e.getSalary() == salary) {
				empsalary.add(e);
			}

		}
		return empsalary;
	}

	public ArrayList<Employee> getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		ArrayList<Employee> empsalary = new ArrayList<Employee>();
		for (Employee e : EmployeeDB.employees) {
			if (e.getSalary() >= salaryRangeMin && e.getSalary() <= salaryRangeMax) {
				empsalary.add(e);
			}

		}
		return empsalary;
	}

}
