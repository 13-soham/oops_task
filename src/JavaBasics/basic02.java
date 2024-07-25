package JavaBasics;

public class basic02 {
    public static void main(String[] args){
        int x = 5;    // int x = 5, y = 6;
        int y = 6;
        System.out.print(x+",");
        System.out.println(y);
        x = x + y;
        y = x - y;
        x = x - y;
        // now x = 6, y = 5;
        System.out.println(x+","+y);
        System.out.print("Addition of "+x+" and "+y+" is ");
        System.out.println(x+y);
        x+=2;
        System.out.println(x); // x = 8;
        double x1 = x, y1 = y; // 8 => 8.0 , 5 => 5.0
        double z = 8/5;
        double z1 = x1/y1;
        System.out.println(z);
        System.out.println(z1);
    }
}

