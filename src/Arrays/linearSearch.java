package Arrays;
import java.util.*;                                 // O(n) => worst case...
                                                    // O(1) => best case...
public class linearSearch {
    public static int search(int arr[], int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 8, 10, 12, 7, 1, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Number you want to search : ");
        int key = sc.nextInt();
        int ans = search(arr, key);
        if(ans == -1){
            System.out.println("Element not found...");
        }
        else{
            System.out.println("your number in "+ (ans+1) +" place...");
        }
    }
}
