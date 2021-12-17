/** * (Use Javadoc tags to document your code too. *
 *  * @author 6187002 *
 *  *  Title:            Challenge 2*
 *  * Semester:         COP3804 - Fall 2022*
 *  Professor's Name: Prof. Charters*
 *  Description of Program’s Functionality: Simulates the lottery *
 *  */
package domain;
import java.util.Random;
import java.util.Scanner;

public class MegaMillionsLotto {
    int[] winningMegaMillionsLottoNums,userLotteryPicks;
    int winningPowerBall,userPowerBall;

    /**
     * Gets powerball and lottery choices from user input, while checking to see that there are no
     * repeat choices
     *
     * Reutrns nothing
     */
    public void getUserPicks(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter seven unique numbers between 1-70");
        for (int i =0;i<7;i++){
            int  num ;
            boolean thereisDuplicate, outOfRange;
            do{
                num = in.nextInt();
                in.nextLine();
                thereisDuplicate = checkForDuplicates(userLotteryPicks,num);
                outOfRange = num<1 || num>70;
                if(thereisDuplicate){System.out.println("You already inputted this number");}
                if (outOfRange){
                    System.out.println("out of range number");
                }
            }
            while(thereisDuplicate || outOfRange);
        userLotteryPicks[i] = num;
        }
        System.out.println("Enter a unique numbers between 1-25");
        userPowerBall = in.nextInt();
        System.out.println("You entered:");
        for (int i : userLotteryPicks){
            System.out.printf("%d ",i);
        }
        System.out.println(userPowerBall);
    }

    /**
     *
     * @param nums - array to be checked
     * @param num - number to heck for duplicates
     * @return if there is a duplciate or not
     *
     * Iterates through the array checking to see if number is present
     *
     *
     */
    boolean checkForDuplicates(int[] nums , int num){
        boolean result = false;
        for (int i:nums){
            result = result || i==num;
        }
        return result;
    }

    /**
     * Checks the user lottery picks to see how much numbers match
     *
     * @return number of guesses that match winning lottery number
     */
     public int checkLotteryMatch(){
        int count = 0;
        for (int numA :userLotteryPicks){
            for(int numB: winningMegaMillionsLottoNums){
                if(numA == numB){
                    count++;
                }
            }
        }
    return count;
    }

    /**
     *
     * @return winning power ball
     */
    public int getWinningPowerBall() {
        return winningPowerBall;
    }

    public int getUserPowerBall() {
        return userPowerBall;
    }


    /**
     * initializes all variables a
     */
    public MegaMillionsLotto() {
        winningMegaMillionsLottoNums = new int[7];
        userLotteryPicks = new int[7];
        Random r = new Random();
        for(int i = 0;i<winningMegaMillionsLottoNums.length;i++ ){
            int num;
            do{num = r.nextInt(69)+1;}
            while (checkForDuplicates(winningMegaMillionsLottoNums,num));
            winningMegaMillionsLottoNums[i] = num;

        }
        for (int i : winningMegaMillionsLottoNums){
            System.out.printf("%d ",i);
        }
        winningPowerBall = r.nextInt(24)+1;
        System.out.printf("%d \n",winningPowerBall);
    }
}
