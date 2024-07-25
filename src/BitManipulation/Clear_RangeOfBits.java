package BitManipulation;

import java.util.*;

public class Clear_RangeOfBits {    // ~0 = 111111111......
    public static int check(int num, int i, int j){     // 0001010 (10) => for (i = 2) and (j = 4); ans is = 0000010(2);
        int a = (~0 << j+1);         // j = 4, so a = 111100000
        int b = (1 << i) -1 ;        // i = 2, so b = (00100 - 1) = 0011
        int bitMask = a | b;         // (111100000) | (0011) = 111100011
        int cal = (num & bitMask);   // (0001010 & 111100011) = ...00010 = 2
        return cal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("put your number : ");
        int bin = sc.nextInt();
        System.out.print("starting index : ");
        int i = sc.nextInt();
        System.out.print("ending index : ");
        int j = sc.nextInt();
        int ans = check(bin, i, j);
        System.out.println("after clearing range bits new number is "+ans);
    }
}
