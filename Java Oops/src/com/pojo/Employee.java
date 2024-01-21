package com.pojo;

public abstract class Employee {

	private String empName;
	private int empId;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
		empId = 1;
		empName = "name1";
	}
	
	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}


	
	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public void display() {
		System.out.println("id:-"+empId+"\t"+"name:-"+empName);
	}
	
	abstract public void CalculatePF();
	
}
