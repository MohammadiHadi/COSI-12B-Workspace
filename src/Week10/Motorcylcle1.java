package Week10;

class Motorcycle1 extends Vehicle1 {
    private String helmetModel;

    public Motorcycle1(String brand, String model, int year, String helmetModel) {
        super(brand, model, year);
        this.helmetModel = helmetModel;
    }

    // Override getType method
    public String getType() {
        return "Motorcycle";
    }

    void wheelie() {
        System.out.println("Performing a wheelie on the motorcycle");
    }
}


