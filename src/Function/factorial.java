package Function;
import java.util.Scanner;

public class factorial {
    public static void Calfact(int num){
        int i = 1;
        for(int a=1; a<=num; a++){
            i = i*a;
        }
        System.out.println("factorial of "+num+" is "+i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What number of factorial : ");
        int val = sc.nextInt();
        Calfact(val);
    }
}
