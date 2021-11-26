package org;

public class Department extends College {


	public void deptName() {
		System.out.println("The Department is Mechanical Engineering");
	}
	
	public static void main(String[] args) {
		
		Department dept=new Department();
		dept.deptName();
		dept.collegeCode();
		dept.collegeName();
		dept.collegeRank();
		
	}

}
