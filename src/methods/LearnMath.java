package methods;

public class LearnMath {
    public static void main(String[] args) {
        int a =4;
        int b=7;
        System.out.println(Math.min(a, b));
        System.out.println(Math.max(a, b));
        System.out.println(getRandom(10, 20));
    }

    public static int getRandom(int a, int b) {
//        return (int) (Math.random() * 6 )+ 1;
        return (int) (Math.random()*(b-a+1) + a);
    }
}
