package loops;

public class factorial {
    public static void main(String[] args) {
        int num = 5;
        int i = 1;
        for(int a = 1; a<=num; a++){
            i = i * a;
        }
        System.out.println("factorial of "+num+" is "+i);
    }
}
