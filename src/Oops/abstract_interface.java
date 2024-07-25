package Oops;

public class abstract_interface {
    public static void main(String[] args) {
        Mixed md = new Mixed();
        md.menu();
    }
}

interface Veg{
    String veg_menu = "hari sabzi";
}
interface Non_Veg{
    String non_veg_menu = "chicken tikka";
}

class Mixed implements Veg, Non_Veg{
    void menu(){
        System.out.println("inko "+ veg_menu+ " aur "+ non_veg_menu+" sab laakar de...");
    }
}

