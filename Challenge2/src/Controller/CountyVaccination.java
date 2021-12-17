/** * (Use Javadoc tags to document your code too. *
 *  * @author 6187002 *
 *  *  Title:            Challenge 2*
 *  * Semester:         COP3804 - Fall 2022*
 *  Professor's Name: Prof. Charters*
 *  Description of Program’s Functionality: This program keeps a record of patients vaccination*
 *  This program demonstrates the use of the Scanner class as well as the toString method of objects *
 *  */

package Controller;

import Domain.CoronaVaccine;
import Domain.Patient;

import java.util.Scanner;

public class CountyVaccination {
    static Patient patient1,patient2,patient3;
    static CoronaVaccine record1,record2,record3;

    public static void main(String[] args) {
        vaccinatePeople();
    reportVaccinations();
    }

    private static void reportVaccinations() {

        System.out.println(patient1);
        System.out.println(patient2);
        System.out.println(patient3);

    }

    private static void vaccinatePeople() {
        Scanner input = new Scanner(System.in);

        System.out.println("Adding Vaccine record for person 1");
        System.out.println("First Name:");
        String fname = input.nextLine();
        System.out.println("Last Name:");
        String lname = input.nextLine();
        System.out.println("Birth Date: (mm/dd/yyyy):");
        String bDay = input.nextLine();

        System.out.println("Enter the name of the manufacturer of the vaccine");
        String manufacturer = input.nextLine();
        System.out.println("When was the first shot taken");
        String firstLocation = input.nextLine();
        System.out.println("Where was the first show taken");
        String firstShotDate = input.nextLine();
        System.out.println("When was the second shot taken");
        String secondLocation = input.nextLine();
        System.out.println("Where was the second show taken");
        String secondShotDate = input.nextLine();
        System.out.println("How much doses did you take ");
        int doses = input.nextInt();
        input.nextLine();

        record1 =  new CoronaVaccine(manufacturer, firstLocation,firstShotDate,secondLocation,secondShotDate,doses);
        patient1 = new Patient(fname,lname,bDay,record1);

        System.out.println("Adding Vaccine record for person 2");

        System.out.println("First Name:");
        fname = input.nextLine();
        System.out.println("Last Name:");
        lname = input.nextLine();
        System.out.println("Birth Date: (mm/dd/yyyy):");
        bDay = input.nextLine();

        System.out.println("Enter the name of the manufacturer of the vaccine");
        manufacturer = input.nextLine();
        System.out.println("When was the first shot taken");
        firstLocation = input.nextLine();
        System.out.println("Where was the first show taken");
        firstShotDate = input.nextLine();
        System.out.println("When was the second shot taken");
        secondLocation = input.nextLine();
        System.out.println("Where was the second show taken");
        secondShotDate = input.nextLine();
        System.out.println("How much doses did you take ");
        doses = input.nextInt();
        input.nextLine();

        record2 =  new CoronaVaccine(manufacturer, firstLocation,firstShotDate,secondLocation,secondShotDate,doses);
        patient2 = new Patient(fname,lname,bDay,record2);


        System.out.println("Adding Vaccine record for person 3");

        System.out.println("First Name:");
        fname = input.nextLine();
        System.out.println("Last Name:");
        lname = input.nextLine();
        System.out.println("Birth Date: (mm/dd/yyyy):");
        bDay = input.nextLine();

        System.out.println("Enter the name of the manufacturer of the vaccine");
        manufacturer = input.nextLine();
        System.out.println("When was the first shot taken");
        firstLocation = input.nextLine();
        System.out.println("Where was the first show taken");
        firstShotDate = input.nextLine();
        System.out.println("When was the second shot taken");
        secondLocation = input.nextLine();
        System.out.println("Where was the second show taken");
        secondShotDate = input.nextLine();
        System.out.println("How much doses did you take ");
        doses = input.nextInt();
        input.nextLine();

        record3 =  new CoronaVaccine(manufacturer, firstLocation,firstShotDate,secondLocation,secondShotDate,doses);
        patient3 = new Patient(fname,lname,bDay,record3);



    }

}
