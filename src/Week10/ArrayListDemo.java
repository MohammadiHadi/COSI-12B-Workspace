package Week10;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("list is: " + list);

        list.add("Brandeis");
        System.out.println("list is: " + list);

        list.add("Department");
        System.out.println("list is: " + list);

        list.add("Computer Science");
        System.out.println("list is: " + list);

        list.add(1, "cs12");
        System.out.println("list = " + list);

        System.out.println("before remove list = " + list);
        list.remove(0);
        list.remove(1);
        System.out.println("after remove list = " + list);

        System.out.println("List size is: " + list.size());


    }

}
