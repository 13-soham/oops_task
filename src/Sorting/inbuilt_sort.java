package Sorting;

import java.util.*;

// Time Complexcity = O(nlogn)

public class inbuilt_sort {
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
        System.out.println("after");
        Arrays.sort(arr);
        display(arr);
        System.out.println();
        Integer brr[] = {0, 3, 5, 4, 2, 6, 9, 7, 8, 1};
        Arrays.sort(brr, Collections.reverseOrder());
        for(int i = 0; i < brr.length; i++){
            System.out.print(brr[i]+ " ");
        }
    }
}
