package loopsPattern;

public class PatternHomework {
    public static void main(String[] args) {
        // pattern 1

//        int n =6;
//        for(int i=n; i>=1; i--) {
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            for(int j=i; j>=n-i; j--){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        // pattern 2
//        int n =6;
//        for(int i=n; i>=1; i--) {
//            for(int j=1; j<=i; j++){
//                System.out.print(j + " ");
//            }
//            for(int j=i; j>=n-i; j--){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        // pattern 3
        int n =6;
        for(int i=n; i>=1; i--) {
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
