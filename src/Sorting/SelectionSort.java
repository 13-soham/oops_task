package Sorting;

public class SelectionSort {
//    all cases = O(n^2)
    public static void selection_sort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int elem = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[elem]){
                    elem = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[elem];
            arr[elem] = temp;
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
        int arr[] = {11, 3, 9, 0, 1, 6};
        System.out.println("before ");
        display(arr);
        System.out.println();
        selection_sort(arr);
    }
}
