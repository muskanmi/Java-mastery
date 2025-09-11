package arrays;

public class BasicArrayProblems {
    public static void main(String[] args) {
//        int arr[] = {2, 5, 6, 8, 9, 4};
//        int arr[] = {2, 5, 6, 8, 9, 10}; // check corner cases
        int arr[] = {2, 5, 6, 8, 9, 1};
        lastNumberInSortedPosition(arr);
        for(int a: arr){
            System.out.print(a + " ");
        }
    }

    static void lastNumberInSortedPosition(int arr[]) {
        int n = arr.length;
        int last = arr[n-1];
        // we will use while loop here because we don't know how many times the loop will run. Only have condition
        int swapIndex = n-2;

        while(swapIndex >= 0 && arr[swapIndex] > last) {
            swapIndex--;
        }
        for(int i=n-1; i>=swapIndex+2; i--){
            arr[i] = arr[i-1];
        }
        arr[swapIndex+1] = last;
    }
}
