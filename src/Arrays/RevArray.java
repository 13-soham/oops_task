package Arrays;
import java.util.*;

public class RevArray {
    public static void swap(int arr[]){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        disp(arr);
    }

    public static void disp(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of your array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("element no. "+ (i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        disp(arr);
        swap(arr);
    }
}