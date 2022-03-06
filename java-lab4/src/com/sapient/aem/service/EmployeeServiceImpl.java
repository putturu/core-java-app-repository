package com.sapient.aem.service;

import java.util.Scanner;

import com.sapient.aem.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public Employee getEmployeeDetails() {
		Scanner scanner = new Scanner(System.in);
		try {
			Employee employee= new Employee();
			
			System.out.println("Enter employee id: ");
			employee.setId(Integer.parseInt(scanner.nextLine()));
			System.out.println("Enter employee name: ");
			employee.setName(scanner.nextLine());
			System.out.println("Enter salary: ");
			employee.setSalary(Double.parseDouble(scanner.nextLine()));
			System.out.println("Enter designation: ");
			employee.setDesignation(scanner.nextLine());
			employee.setScheme(this.getInsuranceScheme(employee));
			return employee;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public InsuranceScheme getInsuranceScheme(Employee employee) {
		try {
			Double salary= employee.getSalary();
			String designation= employee.getDesignation();
			
			if(( salary>5000 && salary<20000)  && designation.equalsIgnoreCase("System Associate")){
				return InsuranceScheme.SCHEME_C;
			}else if(( salary>=20000 && salary<40000)  && designation.equalsIgnoreCase("Programmer" )) {
				return InsuranceScheme.SCHEME_B;
			}else if( salary>=40000   && designation.equalsIgnoreCase("Manager" )) {
				return InsuranceScheme.SCHEME_A;
			}else if(salary <5000 && designation.equalsIgnoreCase("Clerk")){
				return InsuranceScheme.NO_SCHEME;
			}			
			return InsuranceScheme.NO_SCHEME;
			
			
			
//			if(salary<=5000 && !designation.equalsIgnoreCase("Clerk")) {
//				return InsuranceScheme.NO_SCHEME;
//			}else if(salary<20000 && designation.equalsIgnoreCase("System Associate"))    {
//				return InsuranceScheme.SCHEME_C;
//			}else if(salary<40000 && designation.equalsIgnoreCase("Programmer")) {
//				return InsuranceScheme.SCHEME_B;
//			}else if( designation.equalsIgnoreCase("Manager")) {
//				return InsuranceScheme.SCHEME_A;
//			}else {
//				return InsuranceScheme.NO_SCHEME;
//			}			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void showEmployeeDetails(Employee employee) {
		try {
			System.out.println("Empid: "+employee.getId());
			System.out.println("Ename: "+ employee.getName());
			System.out.println("Salary: "+ employee.getSalary());
			System.out.println("Designation: "+employee.getDesignation());
			System.out.println("Insurance Scheme: "+ employee.getScheme());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}