package edu.uog.student;

import java.util.Scanner;

public class StudentData {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String StudentID;
	private String courses = "" ;
	private int tutionBalance = 0;
	private int costOfCourse = 600;
	private static int id = 1000;
	
	public StudentData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student First Name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter Student Last Name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1- Senior\n2- Junior\nEnter Studebt class level: ");
		this.gradeYear = in.nextInt();
	
		setSudentID();
		System.out.println(firstName + " " + lastName + " " + " " + gradeYear + StudentID);
	}
	
	private void setSudentID() {
		//Grade level + ID
		id++;
		 this.StudentID =  gradeYear + "" + id;
	}
	
	public void enroll() {
		do {
			System.out.print("Enter Course to enroll(Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tutionBalance = tutionBalance + costOfCourse;
			}
			else {
				break;
			}
		} while(1 !=0);
		
		System.out.println("Enrolles in: " + courses);
	}
	//view Balance 
	public void viewBalance() {
		System.out.println("Your balance is Rs. " + tutionBalance);
	}
	//Pay tuition 
	public void payTuition() {
		viewBalance();
		System.out.println("Enter Your payment: Rs.");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for your payment of Rs." + payment);
		viewBalance();
	}
	//Show info
	public String toString() {
		return "Name: " + firstName + " " + lastName + 
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + StudentID +
				"\nCourses Enrolled:" + courses +
				"\nBalance: Rs." + tutionBalance;
	}
}
