package BitManipulation;

import java.util.*;

public class Update_ithBit {
    public static int check(int num, int i, int n){     // 101011 (43) => for (i = 1) bit is 1; ans is = 101001(41);
        if(n == 0){                                     //101011 (43) => for (i = 2) bit is 0; ans is = 101111(47);
            int bitMask = ~(1<<i);
            int cal = (num & bitMask);
            return cal;
        }
        else{
            int bitMask = (1<<i);
            int cal = (num | bitMask);
            return cal;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("put your number : ");
        int bin = sc.nextInt();
        System.out.print("which index number you want to update : ");
        int i = sc.nextInt();
        System.out.print("update to 1 or 0 : ");
        int n = sc.nextInt();
        int ans = check(bin, i, n);
        System.out.println("after updating bit new number is "+ans);
    }
}
