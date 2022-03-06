package com.sapient.aem.bean;

import com.sapient.aem.service.InsuranceScheme;

	public class Employee {
		private Integer id;
		private String name;
		private Double salary;
		private String designation;
		private InsuranceScheme scheme;
		
		
		public Employee() {
			
		}


		public Employee(Integer id, String name, Double salary, String designation) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.designation = designation;
		}


		public Integer getId() {
			return id;
		}


		public String getName() {
			return name;
		}


		public Double getSalary() {
			return salary;
		}


		public String getDesignation() {
			return designation;
		}


		public InsuranceScheme getScheme() {
			return scheme;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public void setName(String name) {
			this.name = name;
		}


		public void setSalary(Double salary) {
			this.salary = salary;
		}


		public void setDesignation(String designation) {
			this.designation = designation;
		}


		public void setScheme(InsuranceScheme scheme) {
			this.scheme = scheme;
		}


		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
					+ ", scheme=" + scheme + "]";
		}

}
