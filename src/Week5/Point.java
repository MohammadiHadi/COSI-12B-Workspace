package Week5;

public class Point{
     private int x;
     private int y;

      // constructs a new point with the given (x, y) location
     public Point(int x, int y){
          // this.x = x;
          // this.y = y;
          setLocation(x, y);
     }

     public Point(){
          // x = 0;
          // y = 0;
          this(0,0);
     }

     // public Point(Point p){
     //      this.x = p.x;
     //      this.y = p.y;
     // }
     public Point(Point p){
          this(p.x, p.y);
     }



     // shifts this point’s location by the given amount 
     public void translate(int dx, int dy){
          // x += dx;
          // y += dy;
	     setLocation(x + dx, y + dy);
     }

     // Sets this Point's location to be the given (x, y).
     // Throws an exception if newX or newY is negative.
     // Postcondition: x >= 0 && y >= 0
     public void setLocation(int x, int y) {
          if (x < 0 || y < 0) {
               throw new IllegalArgumentException();
          }
          this.x = x;
          this.y = y;
     }


     public double distance(Point other){
          int dx = x - other.x;
          int dy = y - other.y;
          return Math.sqrt(dx * dx + dy * dy);
     }



     public String toString(){
          return "(" + x + ", " + y + ")";    
     }

     // public boolean equals(Point other) {
     //      return x == other.x && y == other.y;
     // }
     public boolean equals(Object o) {
          if (o instanceof Point) {
               Point other = (Point) o;
               return x == other.x && y == other.y;
          } else {
               return false;
          }
     }



     public double distanceFromOrigin(){
          return Math.sqrt(x * x + y * y);
     }


     //A "read-only" access to the x field ("accessor")
     public int getX(){
          return x;
     }



     // Allows clients to change the x field("mutator")
     // public void setX(int x){
     //      this.x = x;
     // }

     //A "read-only" access to the y field ("accessor")
     public int getY(){
          return y;
     }



     // Allows clients to change the y field("mutator")
     // public void setY(int y){
     //      this.y = y;
     // }






}

