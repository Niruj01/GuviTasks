package com.exception3;

import java.util.Scanner;

public class WeekdayArray {
	
	public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day position (0-6): ");

        try {
            int dayIndex = scanner.nextInt();

            if (dayIndex >= 0 && dayIndex <= 6) {
                String dayName = weekdays[dayIndex];
                System.out.println("The day at position " + dayIndex + " is: " + dayName);
            } else {
                System.out.println("Please enter a valid day index between 0 and 6.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds. Please enter a valid day index between 0 and 6.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }

}
