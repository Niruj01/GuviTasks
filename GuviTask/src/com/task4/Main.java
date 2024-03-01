package com.task4;

//parent class 
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

//Child Class
class Employee extends Person {
    String employeeID;
    double salary;

    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }
}

public class Main {

	public static void main(String[] args) {
		  Employee employee = new Employee("Niruj", 23, "18Eu001", 50000.0);
	        System.out.println(employee.name);       // Output: Niruj
	        System.out.println(employee.age);        // Output: 23
	        System.out.println(employee.employeeID); // Output: 18Eu001
	        System.out.println(employee.salary);     // Output: 50000.0
	}

}
