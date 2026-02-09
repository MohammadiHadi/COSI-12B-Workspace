package Week4;
/* Write a static method named hasMidpoint that accepts three integers as parameters and returns true if one of the integers is the midpoint between the other two integers; that is, if one integer is exactly halfway between them.  Your method should return false if no such midpoint relationship exists.
The integers could be passed in any order; the midpoint could be the 1st, 2nd, or 3rd.  You must check all cases.
Calls such as the following should return true :
hasMidpoint(4, 6, 8)
hasMidpoint(2, 10, 6)
hasMidpoint(8, 8, 8)
hasMidpoint(25, 10, -5)
	Calls such as the following should return false :
hasMidpoint(3, 1, 3)
hasMidpoint(1, 3, 1)
hasMidpoint(21, 9, 58)
hasMidpoint(2, 8, 16)

 */
public class PracticeExam2 {
    public static void main(String[] args) {
        System.out.println("Has midpoint? " + hasMidpoint(1, 6, 10));
        System.out.println("Has midpoint? " + hasMidpoint(4, 6, 8));

    }

    // Five solutions
    public static boolean hasMidpoint(int a, int b, int c) {
        double mid = (a + b + c) / 3.0;
        if (a == mid || b == mid || c == mid) {
            return true;
        } else {
            return false;
        }
    }   

    // public static boolean hasMidpoint(int a, int b, int c) {
    //     double mid = (a + b + c) / 3.0;
    //     return (a == mid || b == mid || c == mid);
    // }   

    // public static boolean hasMidpoint(int a, int b, int c) {
    //     return (a == (b + c) / 2.0 || b == (a + c) / 2.0 || c == (a + b) / 2.0);
    // }

    // public static boolean hasMidpoint(int a, int b, int c) {
    //     int max = Math.max(a, Math.max(b, c));
    //     int min = Math.min(a, Math.min(b, c));
    //     double mid = (max + min) / 2.0;

    //     return (a == mid || b == mid || c == mid);
    // }

    // public static boolean hasMidpoint(int a, int b, int c) {
    //     return (a - b == b - c || b - a == a - c || a - c == c - b);
    // }

}
