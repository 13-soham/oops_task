package Arrays;
import java.util.*;

public class BinarySearch {                                          // O(log n) => Avg Case...
    public static void BinSearch(int arr[], int key, int start, int end){
        int mid = (start + end)/2;
        if(start < end ) {
            if (arr[mid] == key) {
                System.out.print("Your element in " + (mid + 1) + " place...");
            } else if (arr[mid] > key) {
                BinSearch(arr, key, start, mid);
            } else if (arr[mid] < key) {
                BinSearch(arr, key, mid + 1, end);
            }
        }
        else{
            System.out.println("Element not found...");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 8, 10, 11, 13, 25};   //sorted arrays needed...
        Scanner sc = new Scanner(System.in);
        System.out.print("What element you want to search : ");
        int key = sc.nextInt();
        int start = 0;
        int end = 7;
        BinSearch(arr, key, start, end);
    }
}
