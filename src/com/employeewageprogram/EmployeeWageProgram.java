package com.employeewageprogram;

public class EmployeeWageProgram {
	public static int empAttendance = (int) (Math.floor(Math.random() * 10) % 2);
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Program!!");
		attendance();
	}
	public static void attendance() {
		if(empAttendance == 0) {
			System.out.println("Employee is absent today.");
		}
		else System.out.println("Employee is present today.");
	}
}
