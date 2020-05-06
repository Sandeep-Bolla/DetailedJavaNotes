package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//hashmap is based on its hash value so got its name

public class SortedMaps {
    public static void main(String[] args) {
        //Map interface
        Map<Integer, String> m1 = new HashMap<>(); //normal hashmap... not sorted...random 
        Map<Integer, String> m2 = new LinkedHashMap<>();//LinkedHashMap is key&value in doubly linked list...same order of the input
        Map<Integer, String> m3 = new TreeMap<>();//TreeMap is sorted in natural order

        mapIterate(m1); //random order somtimes sorted for small hashmaps
        mapIterate(m2); //order of input
        mapIterate(m3); //naural order of java ie.sorted
    }
    public static void mapIterate(Map<Integer, String> map){

        map.put(1,"Cooper");
        map.put(9,"TARS");
        map.put(2,"Murph");
        map.put(5,"Brand");

        for(Integer key: map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
        System.out.println("\n");
    }
}