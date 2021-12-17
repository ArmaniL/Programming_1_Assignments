package vehicle;
import java.util.Random;
public class Car {
    private static  int vehicleCounter = 2000;
    private static  final String CAR_FACTORY_ID = "Norwood";
    private String carID,color,factory,getDoYouLikeIt;
    private int numberOfDoors,mileage;
    public String doYouLikeIt;
    private double price;


    public void setColor(String color) {
        this.color = color;
    }

    public Car(){

        Random r = new Random();
        this.price = r.nextDouble()*1000+35000;
        this.carID = "VIN-"+CAR_FACTORY_ID+"-"+vehicleCounter;
        this.numberOfDoors = 2;
        this.color= "Red";
        this.doYouLikeIt = "Yes";
        vehicleCounter++;
    }

    public Car(String color, int numberOfDoors) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;

        Random r = new Random();
        this.price = r.nextDouble()*1000+35000;
        this.carID = "VIN-"+CAR_FACTORY_ID+"-"+vehicleCounter;
        this.doYouLikeIt = "Yes";
        vehicleCounter++;
    }

    public Car(String color, int numberOfDoors, int mileage, double price) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.mileage = mileage;
        Random r = new Random();
        this.price = r.nextDouble()*1000+35000;
        this.carID = "VIN-"+CAR_FACTORY_ID+"-"+vehicleCounter;
        this.doYouLikeIt = "Yes";
        vehicleCounter++;
    }

    public static void setVehicleCounter(int vehicleCounter) {
        Car.vehicleCounter = vehicleCounter;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public static int getVehicleCounter() {
        return vehicleCounter;
    }

    public String getCarID() {
        return carID;
    }

    public String getColor() {
        return color;
    }

    public String getFactory() {
        return factory;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public double getPrice() {
        return price;
    }
    public void displayInfo(){
        System.out.printf("----------------------------------\n");
        System.out.printf("Car Info\n");
        System.out.printf("----------------------------------\n");
        System.out.printf("CarID:             %s\n",carID);
        System.out.printf("Factory:             %s\n",CAR_FACTORY_ID);
        System.out.printf("Number of Doors:             %d\n",numberOfDoors);
        System.out.printf("Color:             %s\n",color);
        System.out.printf("Mileage:             %d\n",mileage);
        System.out.printf("Price:            $%f\n",price);
        System.out.printf("Do you like it:             %s\n",doYouLikeIt);
    }

    public static void classDisplayInfo(){
        System.out.printf("----------------------------------\n");
        System.out.printf("Car Class Info\n");
        System.out.printf("----------------------------------\n");
        System.out.printf("vehicleCounter:             %d\n",vehicleCounter);
        System.out.printf("CAR_FACTORY_ID:             %s\n",CAR_FACTORY_ID);

    }
}

