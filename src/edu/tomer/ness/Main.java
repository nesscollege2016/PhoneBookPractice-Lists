package edu.tomer.ness;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        ArrayList<String> phones = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter name: ");
            employees.add(scanner.next());

            System.out.println("Enter phone: ");
            String phone = scanner.next();
            phones.add(phone);

            //Validate the Input: 0-100
            //input the grade
            System.out.println("Enter grade: ");
            int grade = scanner.nextInt();

            //While grade is not in range: Input again:
            while (grade < 0 || grade >100){
                System.out.println("Grade must be between 0-100");
                grade = scanner.nextInt();
            }
            grades.add(grade);

            System.out.println("Continue? true/false");
            boolean shouldCountinue = scanner.nextBoolean();
            if (!shouldCountinue){
                break;
            }
        }


        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Name: " + employees.get(i));
            System.out.println("Phone: " + phones.get(i));
            System.out.println("grade: " + grades.get(i));
        }

    }
}
