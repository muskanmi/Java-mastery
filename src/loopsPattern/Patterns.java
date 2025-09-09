package loopsPattern;

public class Patterns {
    public static void main(String[] args) {
        // pattern 1

//        int n = 7;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //pattern 2
//        int n = 5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // pattern 3
//        int n = 6;
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        // pattern 4
        int n =6;
        for(int i =1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
