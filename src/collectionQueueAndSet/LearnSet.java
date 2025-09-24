package collectionQueueAndSet;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

    public static void main(String[] args) {


        Set<Integer> set  = new HashSet<>(); // O1 also can use linkedHashSet On or TreeSet 0logn

        set.add(10);
        set.add(10);
        set.add(20);

        System.out.println(set);

        set.remove(10);
        System.out.println(set);
        System.out.println(set.contains(20));
    }
}
