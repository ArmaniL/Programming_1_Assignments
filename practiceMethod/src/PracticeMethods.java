import java.util.Scanner;

public class PracticeMethods {
    public static int addition(int x,int y){
        return x+y;
    }

    public static int subtraction(int x,int y){
        return x-y;
    }

    public static int multiplication(int x,int y){
        return x*y;
    }

    public static int division(int x,int y){
        return x/y;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number");
        int first = input.nextInt();
        System.out.println("What is the second number");
        int second = input.nextInt();

        System.out.println("Sum is = "+ addition(first,second));

        System.out.println("Diffrence is = "+ subtraction(first,second));

        System.out.println("Product  is = "+ multiplication(first,second));

        System.out.println("Product  is = "+ division(first,second));



    }
}
