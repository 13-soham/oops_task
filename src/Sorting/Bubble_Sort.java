package Sorting;

public class Bubble_Sort {
    public static void bubblesort(int arr[]){
//        Best Case = O(n)
//        Worst Case = O(n^2) => Avg. Case...
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int swap = 0;
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = 1;
                }
            }
            if(swap == 0) {
                break;
            }
        }
        System.out.println("Sorted array: ");
        display(arr);
    }
    public static void display(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 9, 3, 1, 6};
        System.out.println("before ");
        display(arr);
        System.out.println();
        bubblesort(arr);
    }
}