package Week3;

import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x and y coordinates of point A: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter the x and y coordinates of point B: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        // distance between points A and B
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance from A to B is: " + distance);


    }

}
