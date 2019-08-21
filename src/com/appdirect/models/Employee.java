package com.appdirect.models;

public class Employee {

	public int eno;
	public String ename;
	public String designation;
	public double salary;
	public String city;

	public Employee() {

	}

	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}

	public Employee(String ename, String designation, double salary, String city) {
		super();
		this.ename = ename;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
//		return "" + eno + " : " + ename;
		return String.format("(%s,%s,%.2f,%s)", ename, designation,salary,city); 
	}

}