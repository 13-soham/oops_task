package Oops;

public class abstract_class {
    public static void main(String[] args) {
        Pawn pw = new Pawn();
        Queen q = new Queen();
        System.out.println(pw.element);
        System.out.println();
        q.walk();
        pw.walk();
    }
}

abstract class move{
    String element = "chess playing....";
    move(){
        System.out.println("parent constructor call");
        System.out.println();
    }
    abstract void walk();
}

class Queen extends move{
    void walk(){
        System.out.println("moved in all direction.");
    }
    Queen(){
        System.out.println("1st child constructor call");
        System.out.println();
    }
}

class Pawn extends Queen{
    void walk() {
        System.out.println("move forward only.");
    }
    Pawn(){
        System.out.println("2nd child constructor call");
        System.out.println();
    }
}