package Oops;
import java.util.*;

public class bank {                                  // link with client.java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        client.about ab = new client.about();
        client.details dt = new client.details();
        dt.setPassword(1234567);

        System.out.println("          ::----------------->   WELCOME   <-----------------::          ");
        int pwd;
        int n_pwd;
        System.out.println("checking your balance : ");
        System.out.print("want to change password : ");
        char word = sc.next().charAt(0);
        if(word == 'y'){
            System.out.print("give your old password : ");
            pwd = sc.nextInt();

            if(pwd == dt.checkPassword()){
                System.out.print("Create a new 7 digit password : ");
                n_pwd = sc.nextInt();
                dt.setPassword(n_pwd);
                System.out.println("customer name : "+ab.name);
                System.out.println("customer ID : "+ab.id);
                System.out.println("account password : "+dt.getPassword()+"****");
                System.out.println("balance : "+ab.balance);
            }
            else{
                System.out.println("invalid password, calling 911...");
            }
        }
        else if(word == 'n'){
            System.out.println("okey...");
            System.out.println("customer name : "+ab.name);
            System.out.println("customer ID : "+ab.id);
            System.out.println("account password : "+dt.getPassword()+"****");
            System.out.println("balance : "+ab.balance);
        }
        else{
            System.out.println("invalid symbol...");
        }
    }
}
