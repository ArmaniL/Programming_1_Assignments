public class Human {

    //-----------------------------------------------------
    private Car car;
    private int age;
    //-----------------------------------------------------


    public Human(String age) {
        this.age = Integer.valueOf(age);
    }

    //-----------------------------------------------------
    public Human(Car car, String age) {
        this.car = car;
        this.age = Integer.valueOf(age);
    }

    //-----------------------------------------------------
    public Car getCar() {
        return car;
    }

    //-----------------------------------------------------
    public void setCar(Car car) {
        this.car = car;
    }

    //-----------------------------------------------------
    public int getAge() {
        return age;
    }

    //-----------------------------------------------------
    public void setAge(int age) {
        this.age = age;
    }

    //-----------------------------------------------------
    public void displayInfo(){
        if(car == null){
            System.out.printf("Type->Human-> Age: %-5d\n", age);
        }else{
            System.out.printf("Type->Human-> Age: %-5d\n", age);
            System.out.printf("\t\tType->Car-> Price: $%-10.2f\tColor:%-8s\t Doors:%-2d\n",car.getPrice()
                    ,car.getColor()
                    ,car.getNumberOfDoors());

        }//end if else
    }
    //-----------------------------------------------------
}
