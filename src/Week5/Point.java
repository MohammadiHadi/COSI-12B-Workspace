package Week5;

public class Point{
     int x;
     int y;

      // constructs a new point with the given (x, y) location
     public Point(int initialX, int initialY){
          x = initialX;
          y = initialY;
     }

     public Point(){
          x = 0;
          y = 0;
     }


     // shifts this point’s location by the given amount 
     public void translate(int dx, int dy){
          x += dx;
          y += dy;
     }

     public void setLocation(int newX, int newY){
          x = newX;
          y = newY;
     }


     public String toString(){
          return "(" + x + ", " + y + ")";    
     }



}

