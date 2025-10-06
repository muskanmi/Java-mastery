package collectionQueueAndSet;

import java.util.*;

public class LearnComparableAndComparator {
    public static void main(String[] args) {
        Animal a1 = new Animal(4, "Leo", 10);
        Animal a2 = new Animal(2, "Bruno", 4);
        Animal a3 = new Animal(1, "Maxo", 6);
        Animal a4 = new Animal(3, "Don", 3);

        List<Animal> dogs = new ArrayList<>();

        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        System.out.println(dogs);

        Collections.sort(dogs);
        System.out.println(dogs);

        Collections.sort(dogs, (o1, o2) -> o1.name.compareTo(o2.name)); // will sort according to name sorting
        System.out.println(dogs);

        Collections.sort(dogs, Comparator.comparing(Animal::getAge)); // will sort according to age order
        System.out.println(dogs);

        int a[][] = {
                {4, 5, 2},
                {5, 1, 2},
                {1, 4, 7},
        };

        Arrays.sort(a, (arr1, arr2) -> {
            return arr1[0] - arr2[0];
        });

        for(int e[]: a) {
            for(int element: e) {
                System.out.print(element + " ");
            }
            System.out.println(); // already covered in previous video
        }
    }
}
