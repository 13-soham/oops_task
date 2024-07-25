package loops;

public class reverseMAINmethod{
    public static void main(String[] args) {
        int num = 10899;
        int rev = 0;
        int rem = 0;
        int i = 1;
        while(i <= num){
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        System.out.println(rev);
    }
}
