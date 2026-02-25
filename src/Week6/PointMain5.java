package Week6;

import Week5.Point;

public class PointMain5 {
   public static void main(String[] args){
   	//Create two Point objects
   	Point p1 = new Point(5, 2);
   	Point p2 = new Point(4, 3);
   	//Print each point
   	System.out.println("p1 is "+ p1);
   	System.out.println("p2 is "+ p2);
   	//Translate each point to a new location
   	p1.translate(11, 6);
   	p2.translate(1, 7);
   	//Print the points again
   	System.out.println("p1 is "+ p1);
   	System.out.println("p2 is "+ p2);
   }
}


