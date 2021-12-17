/**
 *
 * @6187002
 * Title: Array of Students
 * Semester :Fall 2021
 *Prof .Charreers
 *
 * This program handles a record of students and finds the student with lowest and highest GPA
 */

package domain;

public class Student {
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPantherId() {
        return pantherId;
    }

    public void setPantherId(String pantherId) {
        this.pantherId = pantherId;
    }

    @Override
    public String toString() {
        return "Student First Name: " + firstName + '\n' +
                "Last Name: " + lastName + '\n' +
                "Panther Id: " + pantherId + '\n' +
                "GPA: " + gpa + '\n' ;
    }

    public Student(String firstName, String lastName, String pantherId, double gpa) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.pantherId = pantherId;
        this.gpa = gpa;
    }

    private String lastName, firstName, pantherId;
    private double gpa;
}
