package Week10;

public class VehicleMain1 {
    public static void main(String[] args) {
        VehicleInterface myCar = new Car1("Toyota", "Camry", 2023, 4);
        VehicleInterface myMotorcycle = new Motorcycle1("Harley-Davidson", "Sportster", 2023, "HD2000");

        myCar.start();
        // You can call methods specific to Car using type casting
        if (myCar instanceof Car1) {
            ((Car1) myCar).honk();
        }

        myMotorcycle.start();
        // You can call methods specific to Motorcycle using type casting
        if (myMotorcycle instanceof Motorcycle1) {
            ((Motorcycle1) myMotorcycle).wheelie();
        }
    }
}

