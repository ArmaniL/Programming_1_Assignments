package Controller;

import Domain.Car;

import java.util.Scanner;

public class DemoCar {
    public static void main(String[] args) {
        Car car1 = createDreamCar(), car2 = createDreamCar();
        System.out.println(car1);
        System.out.println(car2);
    }

    public static Car createDreamCar(){
        Scanner input = new Scanner(System.in);

        System.out.println("Color");
        String  color = input.nextLine();


        System.out.println("Make?");
        String  make = input.nextLine();


        System.out.println("Model?");
        String  model = input.nextLine();


        System.out.println("# of Doors?");
        int  numDoors = input.nextInt();

        input.nextLine();


        System.out.println("MPG");
        double   mpg = input.nextDouble();

        return new Car(color,model,make,numDoors,mpg);
    }
}
