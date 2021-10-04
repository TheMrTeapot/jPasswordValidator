package com.ism510;

import java.util.*;

class Student {
    String name;
    double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}

public class Week4Assignment {

    /**
     * Collection of usernames and passwords.
     *
     * @author Rafael Robledo Alonso
     * Author: Rafael Robledo Alonso
     * E-mail Address:  rafael.robledoalonso@student.uagc.edu
     * Programming assignment week 4
     * created on: 10/04/2021
     */

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to the program!");
        List<Student> students = requestStudentsInputs(myObj);

        double averageGrade = calculateAverageGrade(students);
        System.out.println("The average score for the class is : " + averageGrade / 100);
        printStudentsByGrade(students);

    }

    private static void printStudentsByGrade(List<Student> students) {
        List<Student> aGrade = new ArrayList<>();
        List<Student> bGrade = new ArrayList<>();
        List<Student> cGrade = new ArrayList<>();
        List<Student> dGrade = new ArrayList<>();
        List<Student> fGrade = new ArrayList<>();

        for (Student student : students) {
            double scorePercentage = student.grade / 100;
            if (scorePercentage >= .90) {
                aGrade.add(student);
            } else if (scorePercentage >= .80 && scorePercentage < .90) {
                bGrade.add(student);
            } else if (scorePercentage >= .70 && scorePercentage < .80) {
                cGrade.add(student);
            } else if (scorePercentage >= .60 && scorePercentage < .70) {
                dGrade.add(student);
            } else if (scorePercentage < .60) {
                fGrade.add(student);
            }
        }
        System.out.println("A grade students:");
        aGrade.stream()
                .forEach(student -> System.out.println(student.getName()));
        System.out.println("B grade students:");
        bGrade.stream()
                .forEach(student -> System.out.println(student.getName()));
        System.out.println("C grade students:");
        cGrade.stream()
                .forEach(student -> System.out.println(student.getName()));
        System.out.println("D grade students:");
        dGrade.stream()
                .forEach(student -> System.out.println(student.getName()));
        System.out.println("F grade students:");
        fGrade.stream()
                .forEach(student -> System.out.println(student.getName()));


    }


    private static double calculateAverageGrade(List<Student> students) {
        double averageGrade = 0.0;
        for (Student student : students) {
            averageGrade += student.getGrade();
        }
        return averageGrade / students.size();
    }

    private static List<Student> requestStudentsInputs(Scanner myObj) {
        String otherStudent;
        List<Student> listStudents = new ArrayList<>();
        do {

            System.out.println("Enter student name");
            String userName = myObj.nextLine();
            System.out.println("Username is: " + userName);

            System.out.println("Enter grade ");
            double grade = Double.parseDouble(myObj.nextLine());
            listStudents.add(new Student(userName, grade));

            System.out.println("Do you want to add another student? yes/no");
            otherStudent = myObj.nextLine();

        } while (!"no".equalsIgnoreCase(otherStudent));
        return listStudents;
    }
}