package Week10;

abstract class Vehicle1 implements VehicleInterface {
    private String brand;
    private String model;
    private int year;

    public Vehicle1(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Implement the start method from the interface
    public void start() {
        System.out.println("Starting the " + getType() + " - " + brand + " " + model);
    }
}

