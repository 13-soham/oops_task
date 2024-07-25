package array2D;
import java.util.*;

public class diag_sum {
    public static int diag(int arr[][]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == j){
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("primary diagonal sum : "+sum);
        return sum;
    }
    public static int rev_diag(int arr[][], int n){
        int sum = 0;
        int i = 0;
        int j = n - 1;
        while(j >= 0 && i <= n - 1){
         if(i != j){
             sum = sum + arr[i][j];
         }
            i++;
            j--;
        }
        System.out.println("secondary diagonal sum : "+sum);
        return sum;
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
        int ans1 = diag(arr);
        int ans2 = rev_diag(arr, n);
        System.out.println("sum of your both diagonals is : "+(ans1+ans2));
    }
}
