package Oops;

class Number{
    int cal(int a, int b){
        return a + b;
    }
    float cal(int a, float b, float c){                      // overloading
        return a + b + c;
    }
    void cal(){
        System.out.println("I am from Parent Function...");
    }
}

class Bumper extends Number{
    @Override
    void cal(){
        System.out.println("Child function call...");       // overriding
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Bumper bp = new Bumper();
        Number b = new Bumper();
        b.cal();
        bp.cal();
        System.out.println("sum of 2 int values : "+ bp.cal(2, 3));
        System.out.println("Sum of 1 int and 2 float values : "+ bp.cal(9, (float) 2.5, (float) 3.7));
    }
}
