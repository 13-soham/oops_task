package Arrays;
import java.util.Scanner;
public class scorecard {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char name[] = new char [3];

        for(int i = 0; i <= 2; i++ ){
            System.out.print("Input name with one letter of "+(i+1)+" player : ");
            name[i] = sc.next().charAt(0);
            System.out.println();
        }

        int score[] = new int[3];
        for(int i = 0; i <= 2; i++){
            System.out.print("Input score of player "+(i+1)+" : ");
            score[i] = sc.nextInt();
            System.out.println();
        }

        for(int i = 0; i <= 2; i++){
            System.out.println(name[i]+" scores "+score[i]);
        }
    }
}
