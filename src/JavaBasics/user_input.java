package JavaBasics;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your amount in rupee : ");
        double rupee = sc.nextDouble();
        double doller = rupee / 83.17;
        System.out.println("price in doller : "+doller);

        System.out.print("The length of your nose in cm : ");
        double nose = sc.nextDouble();
        double nunu = nose * 0.393 * 1.74;
        System.out.println("Your nunu length : "+nunu+" inch.");
        System.out.println("number you want to divied : ");
        int x = sc.nextInt();
        System.out.println("number that you divied : ");
        int y = sc.nextInt();
        int z1 = x / y;
        double z = x - (y*z1);
        System.out.println("remainder is : "+z);
    }
}
