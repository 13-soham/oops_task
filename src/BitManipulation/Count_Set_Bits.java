package BitManipulation;

import java.util.*;

public class Count_Set_Bits {
    public static int check(int num){
        int count = 0;
        while(num > 0){
            if((num & 1) != 0){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("put your number : ");
        int bin = sc.nextInt();
        int ans = check(bin);
        System.out.println("no. of set bits are :  "+ans);
    }
}
