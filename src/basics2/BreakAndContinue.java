package basics2;

public class BreakAndContinue {
    public static void main(String[] args) {
//        for (int i = 0; i <= 20; i+=2) {
//            System.out.println(i);
//            if(i>=10) break;
//        }

//        int i =0;
//        while(i<=5){
//            System.out.println(i);
//            i++;
//            if(i==3) break;
//        }


//        for (int i = 0; i <= 20; i+=2) {
//            if(i==2 || i==8) continue;
//            if(i>=15) break; // or if(i==2 || i==8 || i>=15) continue;
//            System.out.println("Gave toffee to "+i);
//        }

        for (int count = 0; count < 10; count++) {
            for(int i=1; i<6; i++) {
                System.out.print(i+" ");
            }
            System.out.println("printed "+count);
        }

        for(int i=0; i<5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
