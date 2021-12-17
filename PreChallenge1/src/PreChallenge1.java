import java.util.Scanner;

public class PreChallenge1 {
    public static double day1,day2,day3,day4,day5,sum,average;
    public static void main(String[] args) {
        getUserInput();
        calculate();
        display();
    }

    private static void display() {
        System.out.println("You entered the following grades");
        System.out.printf("Day 1:%.2f\nDay 2:%.2f\nDay 3:%.2f\nDay 4:%.2f\nDay 5:%.2f\n",day1,day2,day3,day4,day5);
        System.out.println("---------------");
        System.out.printf("Total:%,.2f\nAverage:%,.2f",sum,average);
    }

    private static void calculate() {
        sum += day1 + day2 + day3 + day4 + day5;
        average = sum/5.0;
    }

    private static void getUserInput() {
        Scanner  sc = new Scanner(System.in);

        System.out.println("Enter for day 1");
        day1 = sc.nextDouble();
        System.out.println("Enter for day 2");
        day2 = sc.nextDouble();
        System.out.println("Enter for day 3");
        day3 = sc.nextDouble();
        System.out.println("Enter for day 4");
        day4 = sc.nextDouble();
        System.out.println("Enter for day 5");
        day5 = sc.nextDouble();
    }


}
