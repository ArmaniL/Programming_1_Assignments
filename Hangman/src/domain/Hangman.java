/** * (Use Javadoc tags to document your code too. *
 * * @author 6187002 *
 * *  Title:            Hangman*
 * * Semester:         COP3804 - Fall 2021*
 * Professor's Name: Prof. Charters*
 * Description of Program’s Functionality: replica of the famous hangman game*
 * This program demonstrates the use of switch statements and loops*
 *   */
package domain;
import java.util.Random;
public class Hangman {

    public String getSecretWord() {
        return secretWord;
    }

    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }

    private String secretWord;
    private String userGuess="";

    /*creates a hangman object which randoly chooses a word
     and creates the guess string with that string
     */
    public Hangman() {
        Random r = new Random();
        int choice = r.nextInt(5)+1;
       //pick a random word
        switch(choice){
            case 1:
                secretWord="AppleSauce";
                break;

            case 2:
                secretWord="Money";
                break;
            case 3:
                secretWord="Pineapple";
                break;
            case 4:
                secretWord="Florida";
                break;
            case 5:
                secretWord="Pen";
                break;
            default:
                //indicates choice variable is out of range
                secretWord="Error";
                break;

        }
        //pads the user guess with underscores
        for (int i = 0;i<secretWord.length();i++){
            userGuess+='_';
        }

        //System.out.println(secretWord);
        //JOptionPane.showMessageDialog(null,userGuess);
    }

    @Override
    public String toString() {
        return
                "Secret Word is: " + secretWord + '\n' +
                "User Guessed: " + userGuess + '\n';
    }

    public String getUserGuess() {
        return userGuess;
    }

    public void setUserGuess(String userGuess) {
        this.userGuess = userGuess;
    }

}
