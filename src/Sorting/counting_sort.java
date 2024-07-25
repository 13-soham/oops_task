package Sorting;
import java.util.*;

public class counting_sort {
//    Time Complexity => O(n + range)
    public static void countingsort(int arr[]){
        int n = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            n = Math.max(arr[i], n);
        }
//        element put...

        int brr[] = new int[n + 1];
        for(int i = 0; i < arr.length; i++){
            int k = arr[i];
            brr[k]++;              // brr[arr[i]]++;
        }
//        Traverse...

        int j = 0;
        for(int i = 0; i < brr.length; i++){
            while(brr[i] > 0){
                arr[j] = i;
                j++;
                brr[i]--;
            }
        }
        System.out.println("After");
        display(arr);
    }
    public static void display(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 3, 1, 6, 7, 2, 1, 1, 3, 5, 7, 6, 5, 5, 4, 3, 7, 2};
        System.out.println("before ");
        display(arr);
        System.out.println();
        countingsort(arr);
    }
}
