package Function;
import java.util.Scanner;

public class nCr{
    public static int Calfact(int num){
        int i = 1;
        for(int a=1; a<=num; a++){
            i = i*a;
        }
        return i;
    }
    public static int ncr(int n, int r){
        int a1 = Calfact(n);
        int b1 = Calfact(r);
        int c1 = Calfact(n-r);

        int nCr = a1/(b1*c1);
        System.out.println("Binomial coefficient is "+nCr);
        return nCr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("r = ");
        int r = sc.nextInt();
        ncr(n, r);
    }
}
