package com.capg.empapp.db;

import java.util.ArrayList;

import com.capg.empapp.dto.Employee;

public class EmployeeDB {
	// Employee cannot be resolved to a type
	public static ArrayList<Employee> employees = new ArrayList<Employee>();

	public static int count = 0;

	static {

		employees.add(new Employee(101, "ramesh", 8, 7000));
		employees.add(new Employee(102, "suresh", 2, 8000));
		employees.add(new Employee(103, "rakesh", 1, 9000));
		employees.add(new Employee(104, "lokesh", 5, 10000));

	}

	public static boolean addEmployee(Employee e) {

		employees.add(e);

		return true;
	}

	public static int getCount() {
		return employees.size();
	}

}
