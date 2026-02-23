package Week5;

import java.awt.*;

public class PointExample1{
   public static void main(String[] args){
	Point p = new Point(3, 8);
	System.out.println("initially p = " + p);
	p.translate(-1, -2);
	System.out.println("after translating p = " + p);

    p.setLocation(10,10);
    System.out.println("after updating p = " + p);
      // Point p1 = new Point();
      // Point p2 = new Point();
      // System.out.println("the x-coord in p1  is " + p1.x); //access
      // p2.y = 13;   
      // System.out.println("the y-coord in p2 is " + p2.y); //access
      //                            //modify

   }
}

