package JavaBasics;

import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input what upto numbers...");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println();
        System.out.println("sum of "+n+" term of natural number is "+sum);
    }
}
