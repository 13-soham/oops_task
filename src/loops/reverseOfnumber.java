package loops;
import java.util.Scanner;

public class reverseOfnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number : ");
        int num = sc.nextInt();
        int num1 = num;
        int count = -1;     // count the length of the number - 1, so we write count = -1
        while (num1  != 0) {
            count++;
            num1 = num1 / 10;
        }
        int num2 = 0;
        while(num != 0){
            int rem = num % 10;
            int c = 1;
            for(int i=1; i<=count; i++){
                c = 10 * c;                       // power of a number...
            }
            num2 = num2 + (rem * c);
            num = num / 10;
            count--;
        }
        System.out.println(num2);
    }
}