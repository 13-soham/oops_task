package BitManipulation;

import java.util.*;

public class Get_ithBit {
    public static int check(int num, int i){     // 101011 (43) => for (i = 3) bit is 1; index starting with 0, from R to L (<--)
        int bitMask = 1;
        int cal = (num >> i);     // right shift
//        System.out.println(cal);
        int ans = (cal & bitMask);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("put your number : ");
        int bin = sc.nextInt();
        System.out.print("which index number you want to find : ");
        int i = sc.nextInt();
        int ans = check(bin, i);
        System.out.println("your "+i+"th element of binary number of that is "+ans);
    }
}
