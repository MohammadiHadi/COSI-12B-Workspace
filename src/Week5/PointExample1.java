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

   }
}

