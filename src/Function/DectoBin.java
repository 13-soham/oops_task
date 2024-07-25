package Function;
import java.util.*;
public class DectoBin {
    public static int Binary(int num){
        int x = 0;
        int pow = 0;
        while(num > 0){
            int rem = num % 2;
            x = x + rem * (int)Math.pow(10,pow);// typecast to int, because Math.pow() takes double values...
            pow++;
            num = num / 2;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your decimal number : ");
        int dec = sc.nextInt();
        int ans = Binary(dec);
        System.out.println("In Binary, it is : "+ ans);
    }
}
