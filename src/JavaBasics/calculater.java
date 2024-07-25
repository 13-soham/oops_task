package JavaBasics;

import java.util.Scanner;
public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //........
        System.out.print("Enter 1st number : ");
        double n1 = sc.nextDouble();
        System.out.print("Enter 2nd number : ");
        double n2 = sc.nextDouble();
        System.out.print("Enter operation : ");
        char ch = sc.next().charAt(0);
        //char ch = +, -, *, /, %;
        if(ch == '+'){
            double ans1 = n1 + n2;
            System.out.println("\nyour ans is : "+ ans1);
        }
        else if(ch == '-') {
            double ans2 = n1 - n2;
            System.out.println("\nyour ans is : " + ans2);
        }
        else if(ch == '*') {
            double ans3 = n1 * n2;
            System.out.println("\nyour ans is : " + ans3);
        }
        else if(ch == '/') {
            double ans4 = n1 / n2;
            System.out.println("\nyour ans is : " + ans4);
        }
        else if(ch == '%') {
            double ans5 = n1 % n2;
            System.out.println("\nyour ans is : " + ans5);
        }
        else{
            System.out.println("\nINVALID SYMBOL !!!");
        }
                     }
}
