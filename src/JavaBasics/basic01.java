package JavaBasics;
import java.util.*;

public class basic01{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("1st");
        int num1 = sc.nextInt();
        System.out.println("2nd");
        int num2 = sc.nextInt();
        Thread.sleep(2000);
        System.out.println("Loading...");
        Thread.sleep(5000);
        System.out.println("Ans is : " + (num1 + num2));
    }
}