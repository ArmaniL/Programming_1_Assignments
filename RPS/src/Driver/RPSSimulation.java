package Driver;

import Domain.RPSGame;

import java.util.Scanner;

public class RPSSimulation {

    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors");
        System.out.println("Enter R, P, or S");
        Scanner key = new Scanner(System.in);
        String input = key.next();
        // sets it to scissors automatically so no work has to be done in the S case
        int choice = 2;
        switch(input) {
            case "R":
                choice = 0;
                break;
            case "P":
                choice = 1;
                break;
            case "S":
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
                break;
        }
        RPSGame game = new RPSGame(choice);
        game.determinesWinner();
    }
}
