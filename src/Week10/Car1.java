package Week10;

class Car1 extends Vehicle1 {
    private int numberOfDoors;

    public Car1(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Override getType method
    public String getType() {
        return "Car";
    }

    void honk() {
        System.out.println("Honking the car horn");
    }
}

