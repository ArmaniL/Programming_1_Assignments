/** * (Use Javadoc tags to document your code too.
 *  * * @author (6187002)
 *  *   *  Title:*  Calories Consumed & Burned*
 *  * Semester:         COP3804 - Fall 2022
 *  * Professor's Name: Prof. Charters
 *  This program demonstrates the use of the Scanner class as well as formatting output.
 *  It also displays variables and methods.
 *
 *  ...*         */

import java.util.Scanner;
public class Calories {
    static int  day1CalConsumed, day1CalBurned,
            day2CalConsumed, day2CalBurned,
            day3CalConsumed, day3CalBurned,
            day4CalConsumed, day4CalBurned,
            day5CalConsumed, day5CalBurned,
            day6CalConsumed, day6CalBurned,
            day7CalConsumed, day7CalBurned;

    static int totalCaloriesConsumed , totalCaloriesBurned;

    static double averageCaloriesConsumed,
    averageCaloriesBurned, netWeeklyPounds;

    public static void main(String[] args) {
        getUserInput();
        calculateCalories();
        displayCalories();
    }

    /** * Gets the input from the user for each day*/
    public static void getUserInput(){
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter calories consumed for day #1:");
        day1CalConsumed = inp.nextInt();
        System.out.println("Enter calories burned for day #1:");
        day1CalBurned = inp.nextInt();

        System.out.println("Enter calories consumed for day #2:");
        day2CalConsumed = inp.nextInt();
        System.out.println("Enter calories burned for day #2:");
        day2CalBurned = inp.nextInt();

        System.out.println("Enter calories consumed for day #3:");
        day3CalConsumed = inp.nextInt();
        System.out.println("Enter calories burned for day #3:");
        day3CalBurned = inp.nextInt();

        System.out.println("Enter calories consumed for day #4:");
        day4CalConsumed = inp.nextInt();
        System.out.println("Enter calories burned for day #4:");
        day4CalBurned = inp.nextInt();

        System.out.println("Enter calories consumed for day #5:");
        day5CalConsumed = inp.nextInt();
        System.out.println("Enter calories burned for day #5:");
        day5CalBurned = inp.nextInt();

        System.out.println("Enter calories consumed for day #6:");
        day6CalConsumed = inp.nextInt();
        System.out.println("Enter calories burned for day #6:");
        day6CalBurned = inp.nextInt();

        System.out.println("Enter calories consumed for day #7:");
        day7CalConsumed = inp.nextInt();
        System.out.println("Enter calories burned for day #7:");
        day7CalBurned = inp.nextInt();

    }

    /** * Calculates the total and net calories consumed and burned
     *  Preconditions: Get user input
     *  Postconditions: display calories */
    public static void calculateCalories(){
        totalCaloriesConsumed =day1CalConsumed + day2CalConsumed+ day3CalConsumed + day4CalConsumed + day5CalConsumed + day6CalConsumed + day7CalConsumed;
        totalCaloriesBurned = day1CalBurned + day2CalBurned+ day3CalBurned + day4CalBurned + day5CalBurned + day6CalBurned + day7CalBurned;
        averageCaloriesBurned = totalCaloriesBurned/7.0;
        averageCaloriesConsumed = totalCaloriesConsumed/7.0;
        netWeeklyPounds = (double)(averageCaloriesConsumed - averageCaloriesBurned)/3000.0;
    }

    /** * displays the calories  consumed and burned  to two decimal places
     *  Preconditions: Calories were counted */
    public static void displayCalories(){
                System.out.printf("\nYou consumed a total of %,d calories this week.\n",totalCaloriesConsumed);
                System.out.printf("You burned a total of %,d calories this week.\n",totalCaloriesBurned);
                System.out.printf("You consumed an average of %,.2f calories a day.\n",averageCaloriesConsumed);
                System.out.printf("You burned an average of %,.2f calories a day.\n\n",averageCaloriesBurned);
                System.out.printf("Your net weekly gain/loss were %,.2f pounds.\n",netWeeklyPounds);

    }
}
