package Function;
import java.util.*;

public class prac {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        int num = sc.nextInt();
        int factorial = factorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
