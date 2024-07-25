package BitManipulation;

import java.util.*;

public class Check_PowerOf_2 {
    public static int check(int num){
        return (num & num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("put your number : ");
        int bin = sc.nextInt();
        int ans = check(bin);
        if(ans == 0){
            System.out.println("num is power of 2");
        }
        else{
            System.out.println("it is not 2^n type");
        }
    }
}
