package Week11;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;

public class Vocabulary1A {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("test1.txt"));
        Scanner input2 = new Scanner(new File("test2.txt"));
        ArrayList<String> list1 = getWords(input1);
        ArrayList<String> list2 = getWords(input2);
        // System.out.println(Collections.max(list1));
        ArrayList<String> overlap = getOverlap(list1, list2);


        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("overlap = " + overlap);
        reportResults(list1, list2, overlap);

    }

    public static ArrayList<String> getWords(Scanner input) {

        input.useDelimiter("[^a-zA-Z']+");
        // ArrayList<String> words = new ArrayList<String>();
        // while (input.hasNext()) {
        //     String next = input.next().toLowerCase();
        //     if (!words.contains(next)) {
        //         words.add(next);
        //     }
        // }
        // return words;

        // read all words and sort
       ArrayList<String> words = new ArrayList<String>();
       while (input.hasNext()) {
            String next = input.next().toLowerCase();
            words.add(next);
       }
       Collections.sort(words);

       // add unique words to new list and return
       ArrayList<String> result = new ArrayList<String>();
       if (words.size() > 0) {
           result.add(words.get(0));
           for (int i = 1; i < words.size(); i++) {
               if (!words.get(i).equals(words.get(i - 1))) {
                   result.add(words.get(i));
               }
           }
       }
       return result;

    }


    public static ArrayList<String> getOverlap(ArrayList<String> list1, ArrayList<String> list2) {
	ArrayList<String> result = new ArrayList<String>();
	int index1 = 0;
	int index2 = 0;
	while (index1 < list1.size() && index2 < list2.size()) {
		int comparison= list1.get(index1).compareTo(list2.get(index2));
		if (comparison == 0) {
		     result.add(list1.get(index1));
		     index1++;
     	     index2++;
		} else if (comparison < 0) {
		     index1++;
         } else {  // comparison > 0
              index2++;
         }
	}
	return result;
}

// pre : overlap contains the words in common between list1 and list2
// post: reports statistics about two-word lists and their overlap
public static void reportResults(ArrayList<String> list1,
             ArrayList<String> list2, ArrayList<String> overlap) {
      System.out.println("file #1 words = " + list1.size());
      System.out.println("file #2 words = " + list2.size());
      System.out.println("common words  = " + overlap.size());

      double percent1 = 100.0 * overlap.size() / list1.size();
      double percent2 = 100.0 * overlap.size() / list2.size();
      System.out.println("% of file 1 in overlap = " + percent1);
      System.out.println("% of file 2 in overlap = " + percent2);
}



}


