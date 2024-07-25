package Oops;
import java.util.*;
class Customers{
    String name;
    int id;
    double percentage;

    public void details(String name, int id){
        this.name = name;
        this.id = id + 10;
    }
    Customers(){
        // default constructor...
    }
    Customers(String name, int id, double percentage){
        this.name = name;
        this.id = id;
        this.percentage = percentage;
        System.out.println("name : "+this.name +" and his/her new id is : "+this.id+" and he/she got "+this.percentage+" percentage.");
    }
}

public class Basic_class_creation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customers n1 = new Customers();
        System.out.print("name : ");
        String name = sc.nextLine();
        System.out.print("ID : ");
        int id = sc.nextInt();
        n1.details(name, id);
        System.out.print("Percentage : ");
        n1.percentage = sc.nextDouble();
        System.out.println("name : "+n1.name +" and his/her new id is : "+n1.id+" and he/she got "+n1.percentage+" percentage.");
        Customers n2 = new Customers("Sandaar Babu", 327, 97.23);
        Customers n3 = new Customers("Vritita kaamdar", 328, 77.26);
        Customers n4 = new Customers("Sormistha Joardar", 329, 98.20);
        Customers n5 = new Customers("Chuman Gill", 330, 57.39);


    }
}
