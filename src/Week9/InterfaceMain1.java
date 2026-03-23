package Week9;

public class InterfaceMain1{
    public static void main(String[] args) {

        Rectangle rc = new Rectangle(12, 10);
        System.out.println("Area of rectangle is: " + rc.area());
        System.out.println("Preimeter of rectangle is: " + rc.perimeter());

        Circle cr = new Circle(11);
        System.out.println("Preimeter of circle is: " + cr.perimeter());

        Triangle tr = new Triangle(1, 2, 3);
        System.out.println("Area of the triangle is: " + tr.area());


    }
}


