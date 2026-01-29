package Week3;

public class Hypo {
    public static void main(String[] args){
        System.out.println("hypotenuse 1 = " + hypotenuse(5, 14));
	    System.out.println("hypotenuse 2 = " + hypotenuse(3, 4));
        System.out.println("Number is rounded to: "+ Math.round(hypotenuse(5, 14)));

    }

    public static double hypotenuse(double a, double b){
	    double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	    return c;

    }
}
