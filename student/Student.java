package org.student;

import org.department.Department;

public class Student extends Department {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentID();
		obj.studentDept();

	}
	
	public void studentName() {
		System.out.println("Student name: " + "Guru");
	}
	
	public void studentDept() {
		System.out.println("Student Dept: " + "BRANCH 1");
	}
	
	public void studentID() {
		System.out.println("Student ID: " + "BP-2022-001");
	}

}
