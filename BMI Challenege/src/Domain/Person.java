/** * (Use Javadoc tags to document your code too. *
 * * @author (6187002) *
 * *  Title:            BMI Health*
 * * Semester:         COP3804 - Fall 2021*
 * Professor's Name: Prof. Charters*
 * Description of Program’s Functionality: find the BMI of the user and recommends a BMI if the person is unhealthy*
 * This program demonstrates the use of if statements*    */


package Domain;

public class Person {
private String lastName,firstName;
private double heightInches,weightPounds;

    @Override
    public String toString() {
        return  firstName + " " + lastName +
                " weighs " + weightPounds + " pounds and measures "+ heightInches+ " tall\n";
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHeightInches(double heightInches) {
        this.heightInches = heightInches;
    }

    public void setWeightPounds(double weightPounds) {
        this.weightPounds = weightPounds;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getHeightInches() {
        return heightInches;
    }

    public double getWeightPounds() {
        return weightPounds;
    }

    public Person(String lastName, String firstName, double heightInches, double weightPounds) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
    }
    //calculates bmi based on project
    public double calculateBMI(){
        return 703 *weightPounds/(heightInches*heightInches);
    }

    /** Using the parameter value received, use the following table
     *  * to determine the health of the person given their BMI result:
     *  *          * BMI below 18.5 is considered underweight.
     *  * BMI greater or equal than 18.5 and less than 25 is considered healthy.
     *  * BMI greater or equal than 25 and less than 30 is considered overweight.
     *  * BMI greater or equal than 30 and less or equal than 39.9 is considered obese.
     *  * BMI above 39.9 is considered extremely obese.
     *  */
    public String determineHealth(double bmi){
        String healthStatus = "";


        if(bmi>39.9){
            healthStatus = "extremely obese";
        }
        else if (bmi>= 30){
            healthStatus = "obese";
        }
        else if (bmi >= 25 ){
            healthStatus = "overweight";
        }
        else if (bmi >= 18.5){
            healthStatus = "healthy";
        }
        else {
            healthStatus = "underweight";
        }

        return healthStatus;
    }


    /**
     *  * Use the following formula to determine an optimum weight
     *  * given the weight and height of the person:
     *  *
     *  * optimumWeight = (25 * Math.pow(height, 2))/703;
     *  *          */
    public double recommendedWeight(){


        return (25 * Math.pow(heightInches, 2))/703;
    }
}
