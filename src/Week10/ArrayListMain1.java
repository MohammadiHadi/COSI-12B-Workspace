package Week10;

import Week5.Point;

public class ArrayListMain1 {
    public static void main(String[] args) {
        Point p2 = new Point(0,10);
        System.out.println("Making a box for points:");
        Box<Point> b1 = new Box<Point>( ); 
        b1.put(p2); 
        System.out.println(b1.get().getY());

        Box<String> strBox = new Box<>();
        strBox.put("This is a string");
        System.out.println(strBox.get());

                
    }

}

class Box<T>{
    private T object;

    public void put(T object){
        this.object = object; 
    } 

    public T get( ){ 
        return this.object;
    }
}

