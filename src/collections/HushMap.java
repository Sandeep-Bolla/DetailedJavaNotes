package collections;

import java.util.HashMap;
import java.util.Map;

public class HushMap {
    public static void main(String[] args) {
        HashMap<Integer, String> m1 = new HashMap<>();
        //N duplicate Keys but Duplicate Value exist
        m1.put(5, "Cooper"); m1.put(2,"Brand");m1.put(3, "Murph");

        //This Hashmap is not sorted always... its random and that is evident when we print some big hash maps

        for(Map.Entry<Integer,String> entry : m1.entrySet()){ //efficient way of map iteration
            int i = entry.getKey();
            String text = entry.getValue();
            System.out.println(i+" : "+text);
        }

        for(Integer key: m1.keySet()){ //another way of map iterationbased on keys (since they are unique)
            System.out.println(key+" : "+m1.get(key));
        }
    }
}