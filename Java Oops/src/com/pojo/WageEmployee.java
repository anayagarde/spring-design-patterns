package com.pojo;

public class WageEmployee extends Employee {
 private double wages, hours;

 public WageEmployee() {
	 
 }
 
public WageEmployee(String name,int id,double wages, double hours) {
	super(name,id);
	this.wages = wages;
	this.hours = hours;
}

public double getWages() {
	return wages;
}

public void setWages(double wages) {
	this.wages = wages;
}


public double getHours() {
	return hours;
}

public void setHours(double hours) {
	this.hours = hours;
}

public void display() { //function overriding
	super.display();  //calls display of Employee
	System.out.println("hours:-"+hours+"\t"+"wages:-"+wages);
}

public void display(int salary) { //function overloading
	System.out.println("salary:-"+salary);
}

 
	
}
