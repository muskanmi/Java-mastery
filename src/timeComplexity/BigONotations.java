package timeComplexity;

public class BigONotations {
    public static void main(String[] args) {
        int a[] = {3, 7, 1, 7, 23, 5};
        int key = 3; // this will return in O(1)
//        int key = 10; O(n) n is array length (worst case if key is not found)
    }

    // will run in O(1) no matter how much length of array
    static int getFirstNumber(int a[]) {
        return a[0];
    }

    static boolean checkIfNumberIsPresent(int a[], int key) {
        for(int element: a){
            if(element == key) return true;
        }
        return false;
    }
}
