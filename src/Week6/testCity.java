package Week6;

import Week5.Point;

public class testCity {
   public static void main(String[] args) {
      Point location = new Point(1, 5);
      City c = new City ("Boston", 600000, location);
      System.out.println("Location: xcoord:"+c.getLocation().x);
   }
}

