package Oops;
import java.util.*;
                            // 3 types of constructor --> default, parameterized, copy constructor...
class Val{
    double h;
    double w;
    double l;

    Val(){
        System.out.println("abbe value to insert kar vai...");
    }   // default constructor
    Val(double side1, double side2){
        this.l = side1;                                     // parameterized constructor
        this.w = side2;
        System.out.println("Area of the box is : "+ (this.l*this.w)+" units");
    }
    Val(Val v2, double h){
        this.l = v2.l;
        this.h = h;                             // copy constructor
        this.w = v2.w;
        System.out.println("Volume of the box is : "+ (this.l* this.w* this.h)+" units");
    }
}
public class box {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Val v1 = new Val();
        System.out.println("length : ");
        double length = sc.nextDouble();
        System.out.println("width : ");
        double width = sc.nextDouble();
        Val v2 = new Val(length, width);
        System.out.println("height : ");
        double height = sc.nextDouble();
        Val v3 = new Val(v2, height);
    }
}
