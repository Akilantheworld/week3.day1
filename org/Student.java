package org;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student name is J. Akilan");
	}
	
	public void studentDept() {
		System.out.println("The Department is Mechanical Engineering");
	}
		
	public void studentId() {
		System.out.println("621315114302");
	}
	
	public static void main(String[] args) {
		
		Student stu=new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
	}
	
}
