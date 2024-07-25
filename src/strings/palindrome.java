package strings;
import java.util.*;

public class palindrome {
    public static boolean checking(String name1, int n){
        for(int i = 0; i < name1.length()/2; i++) {
            if (name1.charAt(i) != name1.charAt(n - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give your string : ");
        String name1 = sc.next();
        int n = name1.length() - 1;
        Boolean num = checking(name1, n);
        if(num == true){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not paindrome");
        }
    }
}
