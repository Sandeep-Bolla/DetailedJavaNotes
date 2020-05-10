package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDS {
    public static void main(String[] args) {
        String[] emrgncy = {"Ambulance","Helicopter","Life Boat"};
        String[][] drivers = {
            {"D1","D2","D3"},
            {"D4","D5","D6"},
            {"D7","D8","D9"},
        };
        Map<String,Set<String>> m1 = new HashMap<>();
        for(int i=0;i<emrgncy.length;i++){
            String type = emrgncy[i];
            Set<String> dri = new HashSet<>(Arrays.asList(drivers[i]));

            m1.put(type,dri);            
        }
        System.out.println(m1);
    }
}