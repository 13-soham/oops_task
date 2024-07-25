package loops;

import java.util.*;
public class prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num : ");
        int num = sc.nextInt();
        int i = 2;
        while(i < num){
            if(num % i == 0){
                System.out.println("not prime");
                break;
            }
            else{
                i++;
            }
        }
        if(i == num){
            System.out.println("prime");
        }
    }
}
