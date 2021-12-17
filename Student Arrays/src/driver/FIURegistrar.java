/**
 *
 * @6187002
 * Title: Array of Students
 * Semester :Fall 2021
 *Prof .Charreers
 *
 * This program handles a record of students and finds the student with lowest and highest GPA
 */

package driver;

import domain.Student;

import java.util.Scanner;

public class FIURegistrar {

    public static void main(String[] args) {
        processArrayOfStudents(createArrayOfStudents() );
    }
    /*
    Displays the info of all students within the array and shows student with lowest and highest GPA.
    Also calculates the avergae GPA

    @param  arrayOfStudents - keeps and array of students to be processed

     */
    private static void processArrayOfStudents(Student[] arrayOfStudents) {
        Student withMaxGpa = null,withMinGpa = null;
        double maxGpa = Double.MIN_VALUE,minGpa = Double.MAX_VALUE, sumGPA = 0.0;
        for(Student s : arrayOfStudents){
            if (s.getGpa()>maxGpa){
                maxGpa = s.getGpa();
                withMaxGpa = s;
            }
            else if (s.getGpa()<minGpa){
                minGpa = s.getGpa();
                withMinGpa = s;

            }
            System.out.println(s);
            sumGPA += s.getGpa();

    }
        final  int studentCount  = arrayOfStudents.length;
        final double averageGPA  =  sumGPA/studentCount;
        System.out.printf("Average GPA:%f\n\nStudent With Lowest GPA\n\n%sStudent With Highest GPA:\n\n%s",averageGPA,withMinGpa,withMaxGpa);

    }
    /*
    Creates an array of students from  infomraing given within standard input.
    Then it returns this array
    @return array of students
     */
    private static Student[] createArrayOfStudents() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Students do you want to add");
        int capacity = input.nextInt();
        input.nextLine();
        Student [] students = new Student[capacity];
        int counter = 0;
        do {

            System.out.println("Last Name:");
            String last  = input.nextLine();
            System.out.println("First Name:");
            String first = input.nextLine();
            System.out.println("Panther ID:");
            String PantherId = input.nextLine();
            System.out.println("GPA:");
            double gpa = input.nextDouble();
            input.nextLine();
            students[counter] = new Student(first,last,PantherId,gpa);
            counter++;
            System.out.println("Are there anymore Students ");
        }while((input.nextLine().equalsIgnoreCase("yes")) && counter<capacity);


    return students;
    }
}
