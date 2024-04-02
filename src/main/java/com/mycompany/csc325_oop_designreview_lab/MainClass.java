/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

	public static void main(String[] args) {

// CREATE INSTANCES OF SHORTS TO FUFILL CLASS REQUIREMENTS
		short std1Age = 20;
		short std3Age = 30;
		short std4Age = 100;

		Student std1= new Student("James", std1Age);

// ASSIGNED CORRECT CONSTRUCTORS TO FRESHMAN AND SENIOR
		Freshman std2= new Freshman("James", std1Age, 12); // name, age, credits

		Senior std3 = new Senior("John", std3Age, 90);




//PRINTS OUT THE FRESHMAN USING THE TOSTRING METHOD

		System.out.println(std2);
		System.out.println(std3);
		System.out.println("Please enter a GPA for the student");
		System.out.print("GPA: ");

		//CREATES A SCANNER AND ASKS FOR USER TO INPUT AN INT, THEN ASSIGNS IT TO STUDENT 1 AND TESTS TOSTRING()
		Scanner scn = new Scanner(System.in);
		int std1GPA =scn.nextInt();
		std1.setGPA(std1GPA);
		System.out.println(std1.toString());

		//CREATES A SENIOR WITH A BELOW 85 GPA TO SHOW THAT IT WILL BRING THE GPA TO THE MINIMUM WHEN PRINTING
		Senior std4 = new Senior("Max", std4Age, 20);
		System.out.println(std4);
	}

}

// ToDo 5: Fix the error //done

// ToDo 6: Fix the constructor of the Student class //done

// Todo 7: Create two classes for Freshman and Senior //done

// ToDo 8: The senior class should have a minimum of 85 credits  //done

// ToDo 9: Add a toString method for the Student class //done
// ToDo 10: Add a toString method for the Freshman class //done
// ToDo 11: Add a toString method for the Senior class //done
// ToDo 12: Set the gpa of the student using the scanner and user
// 			input and then print the output. //Done
// ToDo 13: add comments and explain your code //Done

