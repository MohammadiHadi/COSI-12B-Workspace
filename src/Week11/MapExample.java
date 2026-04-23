package Week11;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Double> salaryMap = new HashMap<String, Double>();
        salaryMap.put("Stuart", 20000.00);
        salaryMap.put("Marty", 15500.00);
        salaryMap.put("Jenny", 86753.09);
        System.out.println(salaryMap);

        // search the map for a name
        if (salaryMap.containsKey("Jenny")) {
            double salary = salaryMap.get("Jenny");
            System.out.println("Jenny's salary is $" + salary);
        } else {
            System.out.println("I don't have a record for Jenny");
        }


    }

}
