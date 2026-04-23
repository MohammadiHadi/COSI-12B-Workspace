package Week11;

import java.util.*;

public class Birthday {
    public static void main(String[] args){
        Map<String, Integer> m = new HashMap<String, Integer>();
        m.put("Newton", 1642);
        m.put("Darwin", 1809);
        System.out.println(m);

        Set<String> keys = m.keySet();
        Iterator<String> itr = keys.iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println(key + " => " + m.get(key));
        }
    }
}


