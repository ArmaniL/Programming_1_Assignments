package com.company;
import java.util.Scanner;
public class PennyConversion {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.println("How many pennies do you have in your piggy bank");
        int amountOfPennies = input.nextInt();
        convertPennies(amountOfPennies);
    }


    public static void convertPennies(int amountOfPennies){
        System.out.println("Dollars: "+amountOfPennies/100);
        System.out.println("Quarters: "+amountOfPennies/25);
        System.out.println("Dimes: "+amountOfPennies/10);
        System.out.println("Nickels: "+amountOfPennies/5);

    }
}

