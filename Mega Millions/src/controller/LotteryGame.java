/** * (Use Javadoc tags to document your code too. *
 *  * @author 6187002 *
 *  *  Title:            Challenge 2*
 *  * Semester:         COP3804 - Fall 2022*
 *  Professor's Name: Prof. Charters*
 *  Description of Program’s Functionality: Simulates the lottery *
 *  */

package controller;

import domain.MegaMillionsLotto;

public class LotteryGame {
    public static void main(String[] args) {
        MegaMillionsLotto game = new MegaMillionsLotto();
        game.getUserPicks();
        int matchingNums = game.checkLotteryMatch();
        int user = game.getUserPowerBall(),win = game.getWinningPowerBall();
        boolean match = user==win;
        switch (matchingNums){

            case 3:
                System.out.println(match?"$50":"Free ticket");
                break;
            case 4:
                System.out.println(match?"$1000":"$100");
                break;
            case 5:
                System.out.println(match?"$5000":"$500");
                break;
            case 6:
                System.out.println(match?"$10000":"$1000");
                break;
            case 7:
                System.out.println(match?"$500,000":"$50,000");
                break;
            default:
                System.out.println( "Sorry, no prizes today. Try again!");
        }
    }
}
