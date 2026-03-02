package Week6;

import Week5.Point;

public class City {
	String name;
	int population;
    Point location;

   public City(String n, int p, Point l) {
		name = n;
		population = p;
		location = l;	
	 }

   public Point getLocation(){
		return location;
	 }
}


