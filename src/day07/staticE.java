package day07;
class mobile{
    int price;
    String name;
    static String brand;
    mobile()
    {
        price=90;
        name="apple";
        System.out.println("it is called in constructor block");
    }
    static {
        brand="galaxy";
        System.out.println("it was called in sattic block");
    }
    public void show(){
        System.out.println(price+name+brand);
    }
}

public class staticE {
    public static void main(String[] args) {
        mobile o1=new mobile();
        o1.name="iphone";
        o1.price=9;
        mobile.brand="steve";

    }
}
