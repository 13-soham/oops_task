package BitManipulation;

import java.util.*;

public class Clear_last_i_Bits {
    public static int check(int num, int i){     // 101011 (43) => for (i = 2) ; ans is = 101000(40);
        int bitMask = (~0<<i);
        int cal = (num & bitMask);
        return cal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("put your number : ");
        int bin = sc.nextInt();
        System.out.print("how many number from last you want to clear(0) : ");
        int i = sc.nextInt();
        int ans = check(bin, i);
        System.out.println("after clear bit new number is "+ans);
    }
}
