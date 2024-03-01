package com.task1;

public class Person {
	
	private String name;
    private int age = 18;//Default Age 18


    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age of person
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    
    // Example usage:
    public static void main(String[] args) {

        Person person1 = new Person("Niruj", 23);
        person1.displayInfo();
    }

}
