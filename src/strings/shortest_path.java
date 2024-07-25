package strings;
import java.util.*;
// N -> north
// E -> east
// W -> west
// S -> south
public class shortest_path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Declare your direction(each direction represent one unit) : ");
        System.out.print("N -> north." +
                " E -> east." +
                " W -> west." +
                " S -> south. : ");
        String path = sc.next();
        int x = 0;
        int y = 0;
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'N'){
                y++;
            }
            else if(path.charAt(i) == 'S'){
                y--;
            }
            else if(path.charAt(i) == 'E'){
                x++;
            }
            else if(path.charAt(i) == 'W'){
                x--;
            }
        }
        int cal = (int)((Math.pow(x, 2) - 0) + Math.pow(y, 2) - 0);
        float displacement = (float)Math.sqrt(cal);
        System.out.println("Shortest distance of your journey is "+displacement+" units.");
    }
}
