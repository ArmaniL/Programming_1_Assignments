package Domain;
import java.util.Random;
public class RPSGame {

    int  userGuess  ,computerGuess;


    public RPSGame(int userGuess) {
        computerGuess =  new Random().nextInt(3);
        this.userGuess = userGuess;
    }
    @Override
    public String toString() {
        return "RPSGame{" +
                "userGuess=" + userGuess +
                ", computerGuess=" + computerGuess +
                '}';
    }
    public int getUserGuess() {
        return userGuess;
    }
    public void setUserGuess(int userGuess) {
        this.userGuess = userGuess;
    }
    public int getComputerGuess() {
        return computerGuess;
    }
    public void setComputerGuess(int computerGuess) {
        this.computerGuess = computerGuess;
    }

    public void determinesWinner(){
        /*  Rock - 0
            Paper - 1
            Scissors - 2
         */
        System.out.printf("Computer picked %s\n",computerGuess==0?"Rock":computerGuess==1?"Paper":"Scissor" );
        String result = "";
        // Checking for  a tie
        if ( userGuess == computerGuess){
            result = "Tie";
        }
        else {
         // If user picked rock
        if(userGuess == 0){

            result = computerGuess==2?"You Won":"You Lost";
        }
        // Picked Paper
        else if(userGuess == 1){
            result = computerGuess==0?"You Won":"You Lost";
        }
        // Picked Scissors
        else{
            result = computerGuess==1?"You Won":"You Lost";

        }
        }

    System.out.println(result);
    }
        //5.  Define a method determinesWinner()
        //    Use one of the 3 sets of logic in PPT on RPS (nested if, compound if, switch)






}
