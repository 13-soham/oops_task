package loops;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = sc.nextInt();
        int num2 = num;
        int rev = 0;
        while(num2 > 0){
            int rem = num2 % 10;
            rev = (rev * 10) + rem;
            num2 = num2 / 10;
        }
        if(rev == num){
            System.out.println("Your number is palindrome...");
        }
        else{
            System.out.println("It is not a palindrome number...");
        }
    }
}
