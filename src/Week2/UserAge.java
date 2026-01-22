package Week2;

import java.util.Scanner;

public class UserAge {

    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("How old are you? ");  // prompt
    int age = console.nextInt(); 
    System.out.println("Your age is " + age);

    console.close();
       
    }
}
