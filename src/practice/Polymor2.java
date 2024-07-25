                                            // method overriding...
package practice;
class Polymor2 {
    void virjl_van_djk(int a){
        int num = a + 5;
        System.out.println(num + " Super class called...");
    }
}
class renew extends Polymor2{
    @Override
    void virjl_van_djk(int a){
        super.virjl_van_djk(5);
        int num =  a + 6;
        System.out.println(num + " Sub class called...");
    }
}
class result2{
    public static void main(String[] args) {
        renew obj = new renew();
        obj.virjl_van_djk(5);
    }
}
