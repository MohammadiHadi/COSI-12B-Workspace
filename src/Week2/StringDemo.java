package Week2;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
      String s1 = "hello";
      String s2 = "class";
      String s3 = "soon we’ll have the first quiz!";
		
      System.out.println(s1 + " " + s2 + " " + s3);
      System.out.println();
		
      //Use of the method length()
      String s4 = s1 + " " + s2 + " " + s3;
      int strLen = s4.length ();
      System.out.println("The length of the string s4 is: " + strLen);
      System.out.println();
		
      //Use of the method charAt(index)
      char ch = s4.charAt (3);
      System.out.println("The character in string s4 at location 3 is: " + ch);
      System.out.println();
		
      //Use of the method toUpperCase()
      String newString = s4.toUpperCase();
      System.out.println(newString);


      Scanner console = new Scanner(System.in);
      String word = console.next();
        char last = word.charAt(word.length() - 1);
        if (last == 's') {
            System.out.println(word + " is plural.");
        }


        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c);
        }


        System.out.print("What is your name? ");
        String name = console.next();
        if (name == "Barney") {
        System.out.println("I love you, you love me,");
        System.out.println("We're a happy family!");
        }



   }



}
