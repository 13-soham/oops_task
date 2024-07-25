package BitManipulation;
import java.util.*;
public class odd_even {
    public static int check(int num){       // 1011 = odd, 1010 = even
        int bitMask = 1;
        int cal = (num & bitMask);
        return cal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("put your number : ");
        int bin = sc.nextInt();
        int ans = check(bin);
        if(ans == 1){
            System.out.println("number is odd.");
        }
        else{
            System.out.println("number is even.");
        }
    }
}
