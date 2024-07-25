package BitManipulation;

import java.util.*;

public class Fast_Exponentiation {               // T(n) = 0(log n)
    public static int check(int num, int p){
        int ans = 1;                             // check for 3 ^ 5 = 243   5 => 101
        while(p > 0){
            if((p & 1) != 0){                 // check that LSB is not 0
                ans = ans * num;
            }
             num = num * num;
            p = p >> 1;                    // changing the last bit after every iteration
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("put your number : ");
        int bin = sc.nextInt();
        System.out.print("power of that number : ");
        int p = sc.nextInt();
        int ans = check(bin, p);
        System.out.println("your answer throw fast exponentiation is "+ans);
    }
}
