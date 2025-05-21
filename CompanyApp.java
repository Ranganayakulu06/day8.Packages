package com.company.app;

import  com.company.hr.Employee;
import com.company.admin.Department;

public class CompanyApp {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setId(123456);
		employee.setName("Sp Ranganayakulu");
		employee.setSalary(30000);
		
		Department department = new Department();
		department.setDeptName("Java");
		department.setDeptId(41);
		
		employee.showEmployeeDetails();
		System.out.println();
		department.showDepartmentDetails();
	}
}
