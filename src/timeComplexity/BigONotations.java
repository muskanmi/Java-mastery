package timeComplexity;

public class BigONotations {
    public static void main(String[] args) {
        int a[] = {3, 7, 1, 7, 23, 5}; // array define
        int key = 3; // this will return in O(1) best case
//        int key = 10; O(n) n is array length (worst case if key is not found)

        printAllPairsInArray(a); // calling the function
    }

    // will run in O(1) no matter how much length of array   (Time complexity)
    static int getFirstNumber(int a[]) { // getter array element function
        return a[0];
    }

    // in worst time complexity it will run O(n) best case O(1)  (Time Complexity)
    static boolean checkIfNumberIsPresent(int a[], int key) {
        for(int element: a){
            if(element == key) return true;
        }
        return false;
    }

    // O(n^2)    (Time Complexity)
    static void printAllPairsInArray(int a[]) {
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                System.out.println(a[i] + " " + a[j]);
            }
        }
    }
}
