package Week9;
abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Abstract method to get the type of vehicle
    abstract String getType();

    // Concrete method to start the vehicle
    void start() {
        System.out.println("Starting the " + getType() + " - " + brand + " " + model);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    //Override getType method
    String getType() {
        return "Car";
    }

    void honk() {
        System.out.println("Honking the car horn");
    }
}

class Motorcycle extends Vehicle {
    private String helmetModel;

    public Motorcycle(String brand, String model, int year, String helmetModel) {
        super(brand, model, year);
        this.helmetModel = helmetModel;
    }

    //Override getType method
    String getType() {
        return "Motorcycle";
    }

    void wheelie() {
        System.out.println("Performing a wheelie on the motorcycle");
    }
}



public class AbstractMain3 {
    public static void main(String[] args) {
        Car c = new Car("BMW","850" , 2022, 2);
        c.honk();
        c.start();
    }

}
