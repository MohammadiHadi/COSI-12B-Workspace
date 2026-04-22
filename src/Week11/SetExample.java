package Week11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;


public class SetExample {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> strings= new HashSet<String>();
        strings.add("Larry");
        strings.add("Moe");
        strings.add("Curly");
        strings.add("Moe");    // duplicate, won’t be added
        strings.add("Shemp");
        strings.add("Moe");    // duplicate, won’t be added
        System.out.println(strings);


        Set<String> words = new HashSet<String>();
        Scanner in = new Scanner(new File("test1.txt"));
        while(in.hasNext()) {
            String word = in.next();
            word = word.toLowerCase();
            words.add(word);
        }
        System.out.println("Number of unique words =" + words.size());


        Iterator<String> itr = words.iterator();
        while (itr.hasNext()){
            String word = itr.next();
            System.out.println(word);
        }


    }

}
