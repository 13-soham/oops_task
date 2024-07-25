package Oops;
import java.util.*;
class Price{
    int price1 = 30;
    int price2 = 9;
}

class TotalScreen extends Price{
    double collection(int num1, int num2){
        double price = (num1 * super.price1) + (num2 * super.price2);
        return price;
    }
}
class NetIncome extends TotalScreen{
    double rs = 60000;
    double ott = rs / 5;
    double income;
    NetIncome(){
        // nothing...
    }
    NetIncome(double income){
        this.income = income;
    }
    void budget(){
        double share = 0.3;
        System.out.println("total budget of the movie : "+rs);
        System.out.println("total income of the movie : "+income);
        System.out.println();
        double income1 = income - (income * share);
        double profit = income1 - rs;
        if(profit < 0){
            System.out.println("we are making losses of that movie...");
        }
        else{
            System.out.println("we have profit rs. "+profit+" from that movie...");
        }
    }
}

public class inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        TotalScreen tt = new TotalScreen();
        NetIncome nt = new NetIncome();
        System.out.print("no. of people going to IMAX screen : ");
        int imax = sc.nextInt();
        System.out.print("no. of people going to single screen : ");
        int single = sc.nextInt();
        double screen_collection = nt.collection(imax,single);
        NetIncome nt1 = new NetIncome(screen_collection);
        nt1.budget();
    }
}
