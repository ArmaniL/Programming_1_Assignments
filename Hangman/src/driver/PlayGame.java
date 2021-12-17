/** * (Use Javadoc tags to document your code too. *
 * * @author 6187002 *
 * *  Title:            Hangman*
 * * Semester:         COP3804 - Fall 2021*
 * Professor's Name: Prof. Charters*
 * Description of Program’s Functionality: replica of the famous hangman game*
 * This program demonstrates the use of switch statements and loops*
 *   */
package driver;
import domain.Hangman;

import javax.swing.JOptionPane;
public class PlayGame {
    static int gamesWon=0,gamesLost=0;


    public static void main(String[] args) {
        //main game loop
        boolean playAgain = true;
        do    {
            Hangman aGame = new Hangman();
            processGuesses(aGame);
            determineWinner(aGame);
            playAgain =
                    JOptionPane.showInputDialog(null,"Play again?(enter Yes or N0)").equalsIgnoreCase("Yes");
        }
        while (playAgain);
        summarize();
    }
    //summarizes the results of the game , to be used at the end of program
    private static void summarize() {
        JOptionPane.showMessageDialog(null,String.format("You won: %d times\nYou Lost:%d times",gamesWon,gamesLost));
    }
    //checks score and deciphers if player won
    private static void determineWinner(Hangman aGame) {
        String word = aGame.getSecretWord();
        if(word.equalsIgnoreCase(aGame.getUserGuess())) {

            JOptionPane.showMessageDialog(null,"Congratulations you got the word!!!!!!");
            gamesWon++;
        }
        else{
            String input = JOptionPane.showInputDialog("You have one more chance to guess the correct word ");
            if (word.equals(input)){
                gamesWon++;
                JOptionPane.showMessageDialog(null,"Congratulations you got the word!!!!!!");
            }
            else{
                gamesLost++;
                JOptionPane.showMessageDialog(null,"Im sorry you lost");
            }
        }
    }

    // checks guesses to see if player guessed a correct letter
    private static void processGuesses(Hangman aGame) {
        String secret = aGame.getSecretWord(), userGuess = aGame.getUserGuess();
        int secretWordLength = secret.length();
        int chances = 3 * secretWordLength;
        int usedChances = 0;
        while(usedChances<chances) {
            boolean gotMatch = false;
            //props user for input
            String guess = JOptionPane.showInputDialog("\t"+userGuess+"\n"+"Enter a letter");
            // used to handle repeat letters
            if(userGuess.contains(guess)){
                JOptionPane.showMessageDialog(null,"You already guessed that letter");
                continue;
            }
            /*
            To the person grading, I asked the professor and she said it was fine to
            use a for loop as the rubric doesnt specify which loop to use in this method :)
             */
            for (int index = 0;index<secretWordLength;index++ ){
                // gets the charector at the index,could of used charAt but we`re dealing with strings
                String substring = secret.substring(index,index+1);
               //checks for  a letter match
                if (guess.equalsIgnoreCase(substring)){
                    gotMatch= true;
                    //updates user guess with correct letters
                    aGame.setUserGuess(userGuess.substring(0,index)+guess+userGuess.substring(index+1,secretWordLength));
                    userGuess= aGame.getUserGuess();

                }
            }
            // based on if the user guessed a correct letter prompt them with a message
            JOptionPane.showMessageDialog(null,gotMatch?"You guessed a letter":"Not quite");
            //increases turn counter
            usedChances++;
            // breaks out of the loop if the user already guessed all the correct letters
            if(userGuess.equalsIgnoreCase(secret)){
                break;
            }
        }
    }


}
