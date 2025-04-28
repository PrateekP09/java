package com.encapsulation;


class Employee{
	private int empId;
	private String empName;
	
	public void setempId(int empId) {
		this.empId= empId;
	}
	
	public int getempId() {
		return this.empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
public class test1 {

	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.setempId(100);
	}

}
