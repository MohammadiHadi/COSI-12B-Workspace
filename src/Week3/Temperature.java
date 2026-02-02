package Week3;

import java.util.*;
import java.io.*;

public class Temperature {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("weather.txt"));
        double prev = input.nextDouble();   
        while (input.hasNext()) {
            if (input.hasNextDouble()) {
                double next = input.nextDouble();
                System.out.println(prev + " to " + next + ", change = " + (next - prev));
                prev = next;
            } else {
                input.next();  // throw away unwanted token
            }
        }

    }
}
