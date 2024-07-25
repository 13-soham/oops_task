package strings;
import java.util.*;

public class convert_uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give your sentence : ");
        String word = sc.nextLine();
        StringBuilder sb = new StringBuilder(word);
//        System.out.println(sb.length());
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        for(int i = 0; i < sb.length(); i++){
//            System.out.println(sb.charAt(i));
            if(sb.charAt(i) == ' '){
                sb.setCharAt(i+1, Character.toUpperCase(sb.charAt(i+1)));
            }
        }
        System.out.println(sb);
    }
}
