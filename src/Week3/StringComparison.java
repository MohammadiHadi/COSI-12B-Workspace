package Week3;

public class StringComparison {
    public static void main(String[] args) {
        String x = "Hello";          
        String y = "World!";  
        x = x + " "+ y;             
        int numbChars = x.length();
        y = x.substring(0,5) + x.charAt(numbChars-1);
        System.out.println(y);  // true (Both from String Pool)

        String a = null;
        System.out.println(a.charAt(0));  
      
    }
}


