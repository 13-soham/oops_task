                                      // method overloading...
package practice;
class polymorphism {
    void papa(int x){
        if(x > 2 && x < 10){
            System.out.println("puttarrr...");
        }
    }
    void papa(int x, int y){
        if(x + y < 5){
            System.out.println("jite raho beta...");
        }
    }
}
class result{
    public static void main(String[] args) {
        polymorphism obj = new polymorphism();
        obj.papa(7);
        obj.papa(1,3);
    }
}
