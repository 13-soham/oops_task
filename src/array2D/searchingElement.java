package array2D;
import java.util.*;

public class searchingElement {
    public static void display(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void search(int arr[][], int x){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == x){
                    System.out.println("index found for element "+x+" is : "+"["+i+"]["+j+"]");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int c = sc.nextInt();

//        data_type array_name[][];   (OR)     data_type[][] array_name;

        int arr[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print("Enter "+i+j+" element : ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        display(arr);
        System.out.println("which element you want to find : ");
        int x = sc.nextInt();
        search(arr,x);
    }
}

