package genericAndWrapperClasses;

public class LearnGenerics {
    public static void main(String[] args) {
        Dog<String> d1 = new Dog<>("123");

        Dog<Integer> d2 = new Dog<>(12);
    }
}

class Dog<E> {
    E id;

//    V name;

    public Dog(E id) {
        this.id = id;
//        this.name = name;
    }
}
