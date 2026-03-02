package Week5;

public class Point{
     public int x;
     public int y;

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

     public void setLocation(int x, int y){
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




}

