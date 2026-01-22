package Week2;

public class Consecutive {
    public static void main(String[] args) {
        System.out.println("consecutvie pair? "+ twoConsecutive(11, 0, 2));
        System.out.println("consecutvie pair? "+ twoConsecutive(100, 200, 201));

    }

    public static boolean twoConsecutive(int a, int b, int c) {
        if (b == a + 1 || a == b + 1) { 
             return true; 
        } else if (c == b + 1 || b == c + 1) { 
             return true; 
        } else if (a == c + 1 || c == a + 1) { 
             return true; 
        } else { 
             return false; 
        } 

     
    }

}
