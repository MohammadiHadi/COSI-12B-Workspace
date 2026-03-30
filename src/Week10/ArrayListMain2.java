package Week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMain2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("names.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (input.hasNext()){
            String name = input.next();
            if (!list.contains(name)) {
                list.add(name);
            }
        }
        System.out.println("list = " + list);

        // list.clear();
        // System.out.println("list = " + list);

        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(13);
         number.add(47);
         number.add(15);
         number.add(9);
        int sum = 0;
        for (int n :  number) {
            sum += n;
        }
        System.out.println("number list = " +  number);
        System.out.println("sum = " + sum);


    }

}
