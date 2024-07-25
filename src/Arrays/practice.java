package Arrays;
import java.util.*;

public class practice {
    public static int binSearch(int arr[], int key, int start, int end){
        int mid  = (start + end) / 2;
        if(start <= end){
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                return binSearch(arr, key, start, mid-1);
            }
            else if(arr[mid] < key){
                return binSearch(arr, key, mid + 1, end);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements in the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("element no. "+(i + 1)+" is : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Input taking completed...");
        System.out.print("Which element you want to search? => ");
        int key = sc.nextInt();
        int ans = binSearch(arr, key, 0, n-1);
        if(ans != -1){
            System.out.print("Your element found at index no. "+ans);
        }
        else{
            System.out.println("Element not found...");
        }
    }
}
