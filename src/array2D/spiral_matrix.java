package array2D;

import java.util.*;

public class spiral_matrix {
    public static void display(int arr[][], int row, int column){
        int top_border = 0;
        int bottom_border = row - 1;   // arr.length - 1
        int left_border = 0;           // arr[0].length - 1
        int right_border = column - 1;
        while(left_border <= right_border && top_border <= bottom_border){
            for(int i = left_border; i <= right_border; i++){          // ---->
                System.out.print(arr[top_border][i]+" ");
            }
            top_border++;
            for(int i = top_border; i <= bottom_border; i++){
                System.out.print(arr[i][right_border]+" ");
            }
            right_border--;
            if(top_border <= bottom_border){
                for(int i = right_border; i >= left_border; i--){
                    System.out.print(arr[bottom_border][i]+" ");
                }
                bottom_border--;
            }
            if(left_border <= right_border){
                for(int i = bottom_border; i >= top_border; i--){
                    System.out.print(arr[i][left_border]+" ");
                }
                left_border++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print("Enter "+i+j+" element : ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        display(arr, r, c);
    }
}
