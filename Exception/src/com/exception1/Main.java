package com.exception1;

public class Main {
	
	 public static void main(String[] args) {
	        try {
	            Student student1 = new Student(101, "Niruj", 18, "Computer Science");
	            System.out.println("Student 1 created successfully.");

	            // Testing with invalid age
	            Student student2 = new Student(102, "Lavish", 24, "Mathematics");
	            System.out.println("Student 2 created successfully.");
	   
	        } catch (AgeNotWithinRangeException | NameNotValidException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	        
	     // Testing with invalid name
	        
	        try {         
	            Student student3 = new Student(103, "La#$", 17, "Biology");
	            System.out.println("Student 3 created successfully.");

	        } catch (AgeNotWithinRangeException | NameNotValidException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }


}
