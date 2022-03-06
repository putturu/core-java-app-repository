package com.sapient.aem.service;

import com.sapient.aem.bean.Employee;

public interface EmployeeService {
	public abstract Employee getEmployeeDetails();
	public abstract InsuranceScheme getInsuranceScheme(Employee employee);
	public abstract void showEmployeeDetails(Employee employee);
}
