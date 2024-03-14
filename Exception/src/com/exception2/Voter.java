package com.exception2;

public class Voter {
	
	     String voterId;
	     String name;
	     int age;

	    public Voter(String voterId, String name, int age) throws InvalidAgeException {
	        if (age < 18) {
	            throw new InvalidAgeException("Invalid age for voter");
	        }

	        this.voterId = voterId;
	        this.name = name;
	        this.age = age;
	    }


	    public static void main(String[] args) {
	        try {
	            Voter voter = new Voter("101", "Niruj", 26);
	            System.out.println("Voter created successfully");
	        } catch (InvalidAgeException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	        try {
	            Voter voter = new Voter("102", "Lavish", 17);
	            System.out.println("Voter created successfully");
	        } catch (InvalidAgeException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	    
	}
