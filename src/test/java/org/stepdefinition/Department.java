package org.stepdefinition;

public class Department extends Empolyee{

@Override
	void EmpDesignation() {
		// TODO Auto-generated method stub
		System.out.println("Designation:kerla");
	}
	private void EmpName() {
		// TODO Auto-generated method stub
System.out.println("Name:tom");
	}
	public static void main(String[] args) {
		Department d=new Department();
		d.EmpDesignation();
		d.EmpName();
	}
}


