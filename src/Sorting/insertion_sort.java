package Sorting;

public class insertion_sort {
//        Best Case = O(n)
//        Worst Case = O(n^2) => Avg. Case...
    public static void insertionsort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            for(int j = i ; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("after");
        display(arr);
    }
    public static void display(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 3, 5, 4, 2, 6, 9, 7, 8, 1};
        System.out.println("before ");
        display(arr);
        System.out.println();
        insertionsort(arr);
    }
}
