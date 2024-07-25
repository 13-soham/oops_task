package practice;
class construcor {
    int x = 0,y = 69;
    double z = 22.49;
    construcor(int a, String b){
        System.out.println(a+ " " + b);
    }
    void disp(){
        System.out.println(x +" "+ y);
    }
}
class beer{
    public static void main(String[] args) {
        construcor ref = new construcor(420,"Soham");
        ref.disp();
    }
}
