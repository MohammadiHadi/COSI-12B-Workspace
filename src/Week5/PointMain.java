package Week5;

public class PointMain{
    public static void main(String[] args) {
        // Point p1 = new Point();
        // p1.x = 7;
        // p1.y = 2;

        // Point p2 = new Point();
        // p2.x = 4;
        // p2.y = 3;

         // create two Point objects
        // Point p1 = new Point();
        // p1.y = 2;
        // Point p2 = new Point();
        // p2.x = 4;

        // // print p1
        // System.out.println(p1.x + "," + p1.y);  

        // // move p2 and then print it
        // p2.x += 2;
        // p2.y++;
        // System.out.println(p2.x + "," + p2.y);


        // create two Point objects
        Point p1 = new Point(7,2);
        // p1.x = 7;
        // p1.y = 2;

        Point p2 = new Point(4,3);
        // p2.x = 4;
        // p2.y = 3;

	// print the points 
        System.out.println("p1 is (" + p1.getX() + "," + p1.getY() + ")"); 
        System.out.println("p2 is (" + p2.getX() + "," + p2.getY() + ")");        

        // translate each point to a new location
        // p1.x += 11;
        // p1.y += 6;
        // translate(p1, 11, 6);
        p1.translate(11, 6);
        // p2.x += 1;
        // p2.y += 7;
        // translate(p2, 1, 7);
        p2.translate(1, 7);


        // print the points 
        System.out.println("p1 is (" + p1.getX() + "," + p1.getY() + ")"); 
        System.out.println("p2 is (" + p2.getX() + "," + p2.getY() + ")");   
        
        //System.out.println("p1 is: " + p1);    
        System.out.println("p1 is: " + p1.toString());    
        System.out.println("p2 is: " + p2.toString());   
        

        int i = 42;    
        String s = "hello";
        Point p = new Point();

        System.out.println("i is " + i);
        System.out.println("s is " + s);
        System.out.println("p is " + p);


    }

    //A static method to translate a Point
    // public static void translate(Point p, int dx, int dy){
    //     p.x += dx;
    //     p.y += dy;
    // }

}

