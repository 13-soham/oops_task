package strings;

public class string_builder_basic {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("=> ");
        for (char i = 'a'; i <= 'z'; i++){
            sb.append(i+" ");
        }
        System.out.println(sb);
        StringBuilder rr = new StringBuilder("bantu");
        System.out.println(rr);
        System.out.println(rr.charAt(0));
        rr.setCharAt(0, 'c');
        rr.insert(1, 'h');
        rr.deleteCharAt(3);
        System.out.println(rr);
    }
}
