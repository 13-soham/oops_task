package Function;
import java.util.Scanner;

public class PrimeRange {
    public static void Range(int num) {
        for (int i = 2; i < num; i++) {
            int b = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b++;
                }
                else {
                    b = b + 0;
                }
            }
            if (b == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What range of number that you want to see prime : ");
        int n = sc.nextInt();
        Range(n);
    }
}