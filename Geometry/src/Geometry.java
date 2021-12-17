import java.util.Scanner;

public class Geometry {
    public static double circleArea(int radius){
        return Math.PI*radius*radius;
    }

    public static double rectangleArea(int length,int width){
        return width*length;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius");
        int radius = input.nextInt();
        System.out.println("Area of circle is " + circleArea(radius));


        System.out.println("What is the length");
        int l = input.nextInt();

        System.out.println("What is the width");
        int w = input.nextInt();

        System.out.println("Area of rectangle is " + rectangleArea(l,w));

    }
}
