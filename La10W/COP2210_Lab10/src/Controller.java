
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;



public class Controller {

    public static void main(String[] args) throws IOException{


        yourInfoHeader();
        //--------------------------
        // Step 1
        //--------------------------
        System.out.println();

        System.out.println();
        System.out.println("=========================================");
        System.out.println("Data.txt output");
        System.out.println("=========================================");
        File aFile;
        Scanner inFile = null;

        try{


            // String fileLocation = "\Data\data.txt";
            aFile = new File("COP2210_Lab10/Data/data.txt");
            inFile = new Scanner(aFile);
            String line;

            String strCurrentLine;

            while((inFile.hasNext())) {
                strCurrentLine = inFile.nextLine();
                System.out.println(strCurrentLine);
            }//end while
        }
        catch(IOException e) {

            e.printStackTrace();
        }
        finally
        {
            if (inFile != null)
            {
                inFile.close();
            }

        }


        //-----------------------------------------

        //--------------------------
        // Step 2
        //--------------------------

        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Human> humans = new ArrayList<>();
        ArrayList<Fruit> fruits = new ArrayList<>();
        ArrayList<Bowl> bowls = new ArrayList<>();

        Car aCar;



        try {


            aFile = new File("COP2210_Lab10/Data/data.txt");
            inFile = new Scanner(aFile);


            String strCurrentLine;
            String type = "";
            String weight = "";

            while ((inFile.hasNext()))
            {
                strCurrentLine = inFile.nextLine();

                //--------------------------
                // Step 4
                //--------------------------

                String[] tokens = strCurrentLine.split(",");

                if (tokens[0].equals("Car")) {

                    aCar = new Car(tokens[1], tokens[2], tokens[3]);
                    cars.add(aCar);


                    //--------------------------
                    // Step 6
                    //--------------------------
                } else if (tokens[0].equals("Human")) {
                    if (tokens.length <= 2) {
                        humans.add(new Human(tokens[1]));
                    } else {
                        Car car = new Car(tokens[4], tokens[5], tokens[6]);
                        humans.add(new Human(car, tokens[1]));
                        cars.add(car);
                    }//end ifelse


                    // --------------------------
                    // Step 6
                    // --------------------------

                } else if (tokens[0].equals("Fruit")) {
                    fruits.add(new Fruit(tokens[1], tokens[2]));

                    // --------------------------
                    // Step 10
                    // --------------------------

                } else if (tokens[0].equals("Bowl"))
                {
                    ArrayList<Fruit> bowlFruits = new ArrayList<>();

                    if (tokens.length < 3) {
                        bowls.add(new Bowl(bowlFruits, tokens[1], tokens[2]));
                    } else
                    {
                        for (int i = 4; i < tokens.length; i+=3) {
                            type = tokens[i +1];
                            weight = tokens[i+2];
                            bowlFruits.add(new Fruit(type, weight));
                        }

                    }

                        bowls.add(new Bowl(bowlFruits, tokens[1], tokens[2]));
                }//end if
            }


        }catch(IOException e){

            e.printStackTrace();

        }
        finally {
            if (inFile != null)
                  inFile.close();
        }

        //--------------------------
        // Step 5
        //--------------------------
        System.out.println();
        System.out.println("=========================================");
        System.out.println("Car List");
        System.out.println("=========================================");

        //write a loop to display each car


        //--------------------------
        // Step 7
        //--------------------------
        System.out.println();
        System.out.println("=========================================");
        System.out.println("Human List");
        System.out.println("=========================================");
        //write a loop to display each human & their possible car


        //--------------------------
        // Step 9
        //--------------------------
        System.out.println();
        System.out.println("=========================================");
        System.out.println("Fruit List");
        System.out.println("=========================================");
        //write a loop to display each fruit




        //--------------------------
        // Step 11
        //--------------------------
        System.out.println();
        System.out.println("=========================================");
        System.out.println("Bowl List");
        System.out.println("=========================================");
        //write a loop to display each bowl and its contents




        //--------------------------
        // Step 13
        //--------------------------
        System.out.println();
        System.out.println("=========================================");
        System.out.println("Youngest Human without Car");
        System.out.println("=========================================");
      //  findYoungestHumanWithoutCar(humans).displayInfo();
        System.out.println();



        //--------------------------
        // Step 15
        //--------------------------
        System.out.println();
        System.out.println("=========================================");
        System.out.println("Oldest Human with Car");
        System.out.println("=========================================");

        Human oldest = findOldestHumanWithCar(humans);
        if(oldest != null) {
            findOldestHumanWithCar(humans).displayInfo();
        }else{
            System.out.println("There is no human which has a car");
        }
        System.out.println();



        //--------------------------
        // Step 18
        //--------------------------
        System.out.println();
        System.out.println("=========================================");
        System.out.println("Bowl with the most fruit by weight");
        System.out.println("=========================================");
        Bowl heaviest = bowlWithMostFruitWeight(bowls);
        if(heaviest != null) {
            heaviest.displayInfo();
        }else{
            System.out.println("There is no bowl with fruit");
        }
        System.out.println();


    }//end main



//--------------------------------------------------------------------------

    //--------------------------
    // Step 12
    //--------------------------

    public static Human findYoungestHumanWithoutCar(ArrayList<Human> humans){
        Human youngest = null;


        return youngest;
    }


    //--------------------------------------------------------------------------

    //--------------------------
    // Step 14
    //--------------------------
    public static Human findOldestHumanWithCar(ArrayList<Human> humans){
        Human oldest = null;


        return oldest;
    }

    //--------------------------------------------------------------------------

    //--------------------------
    // Step 16
    //--------------------------

    public static Bowl bowlWithMostFruitWeight(ArrayList<Bowl> bowls){
       Bowl heaviest = null;

        return heaviest;
    }




}
