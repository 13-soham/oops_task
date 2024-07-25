package Function;
import java.util.*;
public class BintoDec {
    public static int Decimal(int num){
        int x = 0;
        int pow = 0;
        while(num != 0){
            int rem = num % 10;
            x = x + rem * (int)Math.pow(2,pow);// typecast to int, because Math.pow() takes double values...
            pow++;
            num = num / 10;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your binary number : ");
        int bin = sc.nextInt();
        int ans = Decimal(bin);
        System.out.println("In Decimal, it is : "+ ans);
    }
}

