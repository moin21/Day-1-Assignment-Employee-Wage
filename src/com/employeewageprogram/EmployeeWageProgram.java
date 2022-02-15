package com.employeewageprogram;

public class EmployeeWageProgram {
	public static int empAttendance = (int) (Math.floor(Math.random() * 10) % 3);
	public static final int WAGE_PER_HOUR = 20;
	public static final int FULL_TIME_HOUR = 8;
	public static final int PART_TIME_HOUR = 4;
	public static int dailyWage;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Program!!");
		attendanceWageCalculation();
	}

	public static void attendanceWageCalculation() {
		if (empAttendance == 0) {
			dailyWage = 0;
			System.out.println("Employee is absent today. Total wage is " + dailyWage);
		} else if (empAttendance == 1) {
			dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
			System.out.println("Part Time Employee is present today. Total wage is " + dailyWage);
		} else {
			dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
			System.out.println("Full Time Employee is present today. Total wage is " + dailyWage);
		}
	}
}
