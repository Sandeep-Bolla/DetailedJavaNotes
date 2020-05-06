package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setz {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(); //Unordered or random sometimes
        Set<Integer> s2 = new LinkedHashSet<>(); //Order of Input
        Set<Integer> s3 = new TreeSet<>(); //Normal Order

        System.out.println(s1.isEmpty());

        s1.add(5); s1.add(7);s1.add(5);s1.add(9);s1.add(3);
        s2.add(4); s2.add(7);s2.add(5);s2.add(1);s2.add(8);
        s3.add(9); s3.add(7);s3.add(3);s3.add(1);s3.add(2);

        for(int element: s1){ //for s2 ans s3
            System.out.println(element);
        }

        //searching in sets is lot more efficient than in lists
        System.out.println(s1.contains(1));

        /////Intersection/////
        Set<Integer> intersection = new HashSet<>(s1); //uses the low weight hashset when we dont really know
        intersection.retainAll(s2);//s1&s2 => This will get common elements in s1 and s2

        Set<Integer> difference = new HashSet<>(s2);
        difference.removeAll(s1); //dif = s2-s1=> Will give the elementsthat are present in only in s2
    }

}