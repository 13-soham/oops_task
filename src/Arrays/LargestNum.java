package Arrays;
import java.util.*;
public class LargestNum {                             // O(n) => worst case...
    public static int findLarg(int arr[]){
        int a = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++ ){
            if(a < arr[i]){
                a = arr[i];
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of the array : ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i = 0; i < len; i++){
            System.out.print("num "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        int ans = findLarg(arr);
        System.out.print("Maximum number of your array is : "+ans);
    }
}
