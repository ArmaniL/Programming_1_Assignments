/** * (Use Javadoc tags to document your code too. *
 * * @author 6187002 *
 * *  Title:            FunWithStrings*
 * * Semester:         COP3804 - Spring 2021*
 * Professor's Name: Prof. Charters*
 * Description of Program’s Functionality: *
 * This program demonstrates the use of methods within the String class for text manipulation*
 * The main logic of the program is to get input from the user and then showcase the string functions using the text the user entered  *     */

package Driver;

import java.util.Scanner;
import java.util.Random;

public class FunWithStrings {

    public static void main(String[] args) {
        funWithAString(userString());
    }
    //String input - phrase or word that the user entered
    // uses methods in the string class to manipulate user input
    public static void funWithAString(String input){
        Random random =  new Random();
        int     len = input.length(),
                lastLoc = input.lastIndexOf('i'),
                firstLoc = input.indexOf('e'),
                squaredLen = len*len,
                ranNum = random.nextInt(squaredLen)+1;

        String        firstHalf = input.substring(0,len/2),
                      secondHalf = input.substring(len/2,len),
                      upperParam = input.toUpperCase();
        char charMid = input.charAt(len/2);


        System.out.println("The length of the String " + input + " is " + len);
        System.out.println("The last ‘i’ in " + input + " is located at position " + lastLoc);
        System.out.println("The first ‘e’ in "  + input + " is located at position " + firstLoc);
        System.out.println("The character in the middle of " +  input + "  is  "+ charMid);
        System.out.println( "The first half of " + input + " is " + firstHalf);
        System.out.println("The second half of " + input + " is " + secondHalf);
        System.out.println("Switched halves: "+secondHalf+firstHalf);
        System.out.println("The " + input + " in upper case is " + upperParam);
        System.out.println("The square of the length of " + input + " is " + squaredLen + " and a random number between 1 and " +squaredLen + " is " + ranNum);

        ranNum = random.nextInt(100)+1;
        System.out.println("Congratulations, you just won $" + ranNum + "!  You can go out and treat yourself to a nice dinner!");
    }
    // Gets input from the user
    //return the phrase that the user entered
    public static String userString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a phrase or word that contains atleast 2 of the following vowels: a, e, i. ");
        return input.nextLine();
    }
}
