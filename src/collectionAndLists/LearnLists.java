package collectionAndLists;

import java.util.*;

public class LearnLists {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list.add(10);
        list.add(20); // dynamic memory

        list2.add(1);
        list2.add(2);

        System.out.println(list.get(0));
        list.set(1, 200);

        list.add(2, 1000);

        System.out.println(list);

        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.contains(20));
//        list.remove(1); will remove index
//        list.remove(Integer.valueOf(20)); will remove 20 value at specified index

        list.addAll(list2);
        System.out.println(list);

        Object a[] = list.toArray();
        for(Object e: a) {
            System.out.println(e);
        }

    }
}
