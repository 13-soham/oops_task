package array2D;
import java.util.*;

public class optimized_search_sortedMatrix {
    public static boolean sorted_search(int arr[][], int num){
        int n = arr.length - 1;
        int i = 0;
        while(i <= arr.length - 1 && n >= 0){
            if(arr[i][n] == num){
                System.out.println("element "+num+" found at index : "+"["+i+"]["+n+"]");
                return true;
            }
            else if(arr[i][n] > num){
//                move left...
                 n--;
            }
            else if(arr[i][n] < num){
//                move down...
                i++;
            }

        }
        System.out.println("element not found !!!");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{10, 20, 30, 40},
                       {15, 25, 35, 45},
                       {27, 29, 37, 48},
                       {32, 33, 39, 50}};
//        array should be sorted...
        System.out.print("which element you want to find : ");
        int x = sc.nextInt();
        sorted_search(arr, x);
    }
}
