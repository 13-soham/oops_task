package practice;

class inheritance {
    int a, b;
    void rar(int x, int y){
        a = x;
        b = x + y;
        System.out.println("----------------------------");
        System.out.println(a + " " + b);
    }
}
class loool extends inheritance{
    void disp(String name){

        System.out.println(name);
    }
}
class lool extends loool{
    void show(){
        super.disp("aaaloo");
        System.out.println("aaayen!!!");
    }
}
class boobs extends inheritance{
    int sum = 0;
    int cal(){
        int p = 4;
        int q = 0;
        while(p >= q){
            sum = sum + (p - q);
            p --;
            q ++;
        }
        return sum;
    }
}
class main1{
    public static void main(String[] args) {
        lool ref = new lool();
        boobs ref2 = new boobs();
        ref.show();
        ref.rar(10, 20);
        ref.disp("Kamal");
        int p = ref2.cal();
        System.out.println(p);
    }
}

