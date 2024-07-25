package array2D;
import java.util.*;

// Time complexity = O(n);

public class optimize_diag_sum {
    public static void cal_diag_sum(int arr[][]){
        int sum = 0;
        int n = arr.length - 1;
        for(int i = 0; i < arr.length; i++){
            //primary diagonal sum
            sum = sum + arr[i][i];
            //secondary diagonal sum
            if(i != n){
                sum = sum + arr[i][n];
            }
            n--;
        }
        System.out.println("sum of both diagonals is : "+sum);
    }
    public static void disp(int arr[][]){
        System.out.println("Your matrix : ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows and columns of the matrix : ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
/*        int arr[][] = {{2, 3, 4},
                         {1, 3, 1},
                         {1, 2, 9}}
                          primary diag sum = 14, secondary diag sum = 5, total = 14 + 5 = 19 */
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Enter "+i+j+" element : ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
          disp(arr);
          cal_diag_sum(arr);
    }
}
