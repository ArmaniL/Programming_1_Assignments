/** * (Use Javadoc tags to document your code too. *
 * * @author (6187002) *
 * *  Title:            BMI Health*
 * * Semester:         COP3804 - Fall 2021*
 * Professor's Name: Prof. Charters*
 * Description of Program’s Functionality: find the BMI of the user and recommends a BMI if the person is unhealthy*
 * This program demonstrates the use of if statements*    */

package Driver;

import Domain.Person;

import java.util.Scanner;

public class BMIHealth {
    public static Person anyperson;

    public static void main(String[] args) {
        createPersonObject() ;
        showBMI();
    }

    //initalizes the person object
    public static void createPersonObject(){

        Scanner keyboard = new Scanner(System.in);
        //Ask user for their first & last name, height in inches, and weight in pounds.
        System.out.println("What is your first name ");
        String fname = keyboard.nextLine();
        System.out.println("What is your last name ");
        String lname = keyboard.nextLine();
        System.out.println("how tall are you in inches ");
        double height = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("What do you weight in pounds");
        double  weight = keyboard.nextDouble();
        keyboard.nextLine();

        // Create a Person object using all the user values, and store the person object in
        //         the static variable, anyPerson.

        anyperson  = new Person(lname,fname,height,weight);
    }

    public static void showBMI(){
        //1.) Print the Person object
        System.out.println(anyperson);
        // 2.) Call and store the return value of the method that calculates the person’s
        // BMI, then print the value.
        double bmi = anyperson.calculateBMI();
        // 3.) Call and store the return value of the method that determines the person’s
        // health, then print that value.
        String status = anyperson.determineHealth(bmi);
        // 4.)  If the person's BMI is not considered "healthy" then call and store the
        // return value of the method that calculates the person's recommended
        // weight, and print it.
        System.out.printf("You are %s\n",status);
        if(!(status.equals("healthy"))){
            System.out.printf("Recommended Weight: %.2f \n",anyperson.recommendedWeight());
        }
    }
}
