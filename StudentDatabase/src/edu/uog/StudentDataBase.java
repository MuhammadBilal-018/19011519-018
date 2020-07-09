package edu.uog;

import java.util.Scanner;

import edu.uog.student.StudentData;

public class StudentDataBase {

	public static void main(String[] args){
		//Ask how many users we want to add
		System.out.println("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		
		StudentData[] students = new StudentData[numOfStudents];
	
		//create a number a new student
		for (int n=0; n< numOfStudents; n++) {
			students[n] = new StudentData();
			students[n].enroll();
			students[n].payTuition();
		}
		
		for (int n=0; n< numOfStudents; n++) {
			System.out.println(students[n].toString());
			 
		}

	}


}
