package Week1;

public class ChangeCal {
	public static void main(String[] args){
		int quarters = 10;
		int dimes = 3;
		int nickels = 7;
		int pennies = 6;
		int change = 0;
		change = 25*quarters + 10*dimes + 5*nickels + pennies;
		System.out.println("total in change is:" + change);

        int x = 7;
        double dx = x; //assimgnet conversion
        System.out.println("x is " + x + " and dx is " + dx);

        int a = 5;
        double b = 2.5;
        double sum = a + b; // arithmetic promotion
        System.out.println("Arithmetic promotion: sum = " + sum);

        int total = 7;
        int count = 2;
        double avgWrong = total / count; // assigment conversion
        double avgRight = (double) total / count; //
        System.out.println("Casting (no cast): avgWrong = " + avgWrong);
        System.out.println("Casting (with cast): avgRight = " + avgRight);



	}
}


