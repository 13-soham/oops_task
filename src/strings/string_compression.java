package strings;
import java.util.*;
// T(n) = O(n)

public class string_compression {
    public static String compress(String input){
        StringBuilder sb = new StringBuilder(input);
        StringBuilder newStr = new StringBuilder("");
        for(int i = 0; i < sb.length(); i++){
            int count = 1;
            while (i < sb.length() - 1 && sb.charAt(i) == sb.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(sb.charAt(i));
            if(count > 1){
                newStr.append(count);
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input your string : ");
        String input = sc.nextLine();
        System.out.println("compressed string : "+compress(input));
    }
}
