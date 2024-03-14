package com.exception4;

import java.util.HashMap;

public class StudentGrades {
	
	private HashMap<String, Integer> studentGrades;

    public StudentGrades() {
        this.studentGrades = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
    }

    public void removeStudent(String name) {
        studentGrades.remove(name);
    }

    public Integer getGrade(String name) {
        return studentGrades.get(name);
    }

    public void displayAllStudents() {
        System.out.println("Student Grades:");
        for (String name : studentGrades.keySet()) {
            int grade = studentGrades.get(name);
            System.out.println(name + ": " + grade);
        }
    }

    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();

        // Adding students
        studentGrades.addStudent("Niruj", 90);
        studentGrades.addStudent("Lavish", 85);
        studentGrades.addStudent("guvi", 95);

        // Displaying all students and their grades
        studentGrades.displayAllStudents();

        // Removing a student
        studentGrades.removeStudent("Niruj");

        // Displaying all students after removal

        studentGrades.displayAllStudents();

        // Displaying a specific student's grade
        String studentName = "guvi";
        Integer grade = studentGrades.getGrade(studentName);
        if (grade != null) {
            System.out.println(studentName + "'s grade: " + grade);
        } else {
            System.out.println("Student not found: " + studentName);
        }
    }

}
