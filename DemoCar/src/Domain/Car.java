package Domain;

import java.util.Objects;

public class Car {
private String color,model,make;
private int doors;
private double mpg;

    public Car(String color,String model, String make, int doors, double mpg ){
        this.color=color;
        this.model=model;
        this.make=make;
        this.doors=doors;
        this.mpg=mpg;
    }
    public double getMpg() {
        return mpg;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", doors=" + doors +
                ", mpg=" + mpg +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return doors == car.doors && Double.compare(car.mpg, mpg) == 0 && Objects.equals(color, car.color) && Objects.equals(model, car.model) && Objects.equals(make, car.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model, make, doors, mpg);
    }
}

