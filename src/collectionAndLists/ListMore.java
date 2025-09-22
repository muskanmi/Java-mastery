package collectionAndLists;

import java.util.*;

public class ListMore {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>(); // different type of list we can use LinkedList<>() also

        fruits.add("Kiwi");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");

        for(int i=0; i<fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        Iterator<String> fe = fruits.iterator();
        while (fe.hasNext()) {
            System.out.println(fe.next());
        }

        List<String> smallList = fruits.subList(1, 2);
        System.out.println(smallList);
    }
}
