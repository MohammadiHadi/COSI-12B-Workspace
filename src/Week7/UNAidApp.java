package Week7;

import java.util.*;

import Week5.Point;

import java.io.*;

public class UNAidApp {

     public static void main(String[] args) throws FileNotFoundException {
		
        Scanner input = new Scanner(new File("cities.txt"));
        Point[] cities = readCities(input);

        // drop the supplies
        Scanner console = new Scanner(System.in);
        Point center = new Point();
        System.out.print("Center coordinate x? ");
        center.x = console.nextInt();
        System.out.print("Center coordinate y? ");
        center.y = console.nextInt();
        System.out.print("Delivery radius? ");
        int radius = console.nextInt();
            // prints out the cities
        airdrop(center, radius, cities);
    }

    public static Point[] readCities(Scanner input) {

        int numCities = input.nextInt();   // first line = # of cities
        Point[] cities = new Point[numCities];
        for (int i = 0; i < cities.length; i++) {
     	   cities[i] = new Point();
	   cities[i].x = input.nextInt();  // read city x/y from file
	   cities[i].y = input.nextInt();
        }
        return cities;
    }


    public static void airdrop(Point center, int radius, Point[] cities) {
        for (int i = 0; i < cities.length; i++) {
            double dist = cities[i].distance(center);
        if (dist <= radius) {
            System.out.println("Supplies delivered: (" + cities[i].x +  				"," + cities [i].y + ")");
        }
        }
    }

}


