package app;

import vehicle.Car;

public class Controller {
   

     public static void main(String[] args) {
         yourInfoHeader();
         Car c1 = new Car();
         c1.displayInfo();
         Car.classDisplayInfo();
         Car c2 = new Car("White",4);
         c2.displayInfo();
         Car c3 = new Car("Black",2);
         c3.displayInfo();
         Car c4 = new Car("Blue",4,10432,38500);
         c4.displayInfo();
         System.out.println();
         System.out.println();
         System.out.println("-------------------------------");
         System.out.println("Working with instance method");
         System.out.println("-------------------------------");
         c4.setColor("Green");
         c4.displayInfo();
         System.out.println();
         System.out.println();
         System.out.println("-----------------------------------------");
         System.out.println("working with public instance variable");
         System.out.println("-----------------------------------------");
         System.out.println();
         c2.displayInfo();
         c2.doYouLikeIt = "No";
         c2.displayInfo();
     }

             public static void yourInfoHeader() {
                System.out.println("==============================================");
                System.out.println("PR0GRAHMER= " + "Armani L. Weise");
                System.out.println("PantherID: " + "6187002");
                System.out.println();
                System.out.println("CLASS= \t\t COP2218 ");
                System.out.println("SECTION= \t " + "Replace Text");
                System.out.println("SEMESTER= \t " + "Fall 2021");
                System.out.println("CLASSTIME= \t " + "9:30AM");
                System.out.println();
                System.out.println("Assignment= " + "Replace Text");
                System.out.println();
                System.out.println("CERTIFICATION= \nI understand FIU's academic policies, and I certify");
                System.out.println("that this work is my own and that none of it is the");
                System.out.println("work of any other person.");
                System.out.println("===============================================");
                System.out.println();

             }
}
