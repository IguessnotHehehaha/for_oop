package lab_1.problem_4;

import prac2.Student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Course course = new Course(
                "CS101 Object-oriented Programming and Design",
                "Introduction to object-oriented programming",
                4
        );

        Student studentA = new Student("Student A", 1);
        Student studentB = new Student("Student B", 1);
        Student studentC = new Student("Student C", 1);
        Student studentD = new Student("Student D", 1);
        Student studentE = new Student("Student E", 1);
        Student studentF = new Student("Student F", 1);
        Student studentG = new Student("Student G", 1);
        Student studentH = new Student("Student H", 1);
        Student studentI = new Student("Student I", 1);
        Student studentJ = new Student("Student J", 1);

        GradeBook gradeBook = new GradeBook(course);
        gradeBook.addStudent(studentA);
        gradeBook.addStudent(studentB);
        gradeBook.addStudent(studentC);
        gradeBook.addStudent(studentD);
        gradeBook.addStudent(studentE);
        gradeBook.addStudent(studentF);
        gradeBook.addStudent(studentG);
        gradeBook.addStudent(studentH);
        gradeBook.addStudent(studentI);
        gradeBook.addStudent(studentJ);

        gradeBook.displayMessage();
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input grades for students:");
        System.out.println();

        gradeBook.setGrade(studentA, getGradeInput(scanner, "Student  A"));
        gradeBook.setGrade(studentB, getGradeInput(scanner, "Student  B"));
        gradeBook.setGrade(studentC, getGradeInput(scanner, "Student  C"));
        gradeBook.setGrade(studentD, getGradeInput(scanner, "Student  D"));
        gradeBook.setGrade(studentE, getGradeInput(scanner, "Student  E"));
        gradeBook.setGrade(studentF, getGradeInput(scanner, "Student  F"));
        gradeBook.setGrade(studentG, getGradeInput(scanner, "Student  G"));
        gradeBook.setGrade(studentH, getGradeInput(scanner, "Student  H"));
        gradeBook.setGrade(studentI, getGradeInput(scanner, "Student  I"));
        gradeBook.setGrade(studentJ, getGradeInput(scanner, "Student J"));

        System.out.println();

        gradeBook.displayGradeReport();

        scanner.close();
    }

    private static int getGradeInput(Scanner scanner, String studentName) {
        while (true) {
            try {
                System.out.print(studentName + ": ");
                int grade = scanner.nextInt();

                // Validate range
                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade! Please enter a number between 0 and 100.");
                    continue;
                }

                return grade;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
        }
    }

    public static String calculateLetterGrade(int a) {
        String mark = "";
        if (a > 94) {
            mark = "A";
        } else if (a > 89) {
            mark = "A-";
        } else if (a > 84) {
            mark = "B+";
        } else if (a > 79) {
            mark = "B";
        } else if (a > 74) {
            mark = "B-";
        } else if (a > 69) {
            mark = "C+";
        } else if (a > 64) {
            mark = "C";
        } else if (a > 59) {
            mark = "C-";
        } else if (a > 54) {
            mark = "D+";
        } else if (a > 49) {
            mark = "D";
        } else {
            mark = "F";
        }
        return mark;
    }
}
