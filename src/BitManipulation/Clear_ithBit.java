package BitManipulation;

import java.util.*;

public class Clear_ithBit {
    public static int check(int num, int i){     // 101011 (43) => for (i = 1) bit is 1; ans is = 101001(41);
        int bitMask = ~(1<<i);
        int cal = (num & bitMask);
        return cal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("put your number : ");
        int bin = sc.nextInt();
        System.out.print("which index number you want to clear(0) : ");
        int i = sc.nextInt();
        int ans = check(bin, i);
        System.out.println("after clear bit new number is "+ans);
    }
}
