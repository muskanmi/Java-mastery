package arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int arr[] = {9, 5, 3, 1, 2};
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr );
        for(int a: arr){
            System.out.print(a+ " ");
        }
    }

    static void bubbleSort(int arr[]) { // n^2 time complexity
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void selectionSort(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            int min = i; // assume i is the minimum index
            for(int j= i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    static void insertionSort(int arr[]) {
        int n= arr.length;
        for(int i=1; i<n; i++){
            int last = arr[i];
            int swapIndex = i-1;
            while (swapIndex >=0 && arr[swapIndex] > last) {
                swapIndex--;
            }
            for(int j=i; j > swapIndex + 1; j--){
                arr[j] = arr[j-1];
            }
//            int j=i;
//            while(j > swapIndex) {
//                arr[j] = arr[j-1];
//            }
            arr[swapIndex+1] = last;
        }
    }
}
