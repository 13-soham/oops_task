package loops;

import java.util.Scanner;
public class primeNUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        int i = 2;
        if(num == 1){
            System.out.println("1 is not prime number...");
        }
        else{
            int k = (int)Math.sqrt(num);
            while(i < k){           // for reducing time complexity...O(root of n)
                if(num % i == 0){              // or, for(int i=2; i<num; i++)

                    System.out.println("number is not prime...");
                    break;
                }
                else{
                    i++;
                }
            }
            if(i == k){
                System.out.println("number is prime...");
            }
        }
    }
}