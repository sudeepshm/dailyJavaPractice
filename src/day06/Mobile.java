package day06;
class phone{
    String brand;
    int price;
    String name;
    void show(){
        System.out.println(" "+brand+" "+" "+price+" "+" "+name);
    }
}
public class Mobile {
    public static void main(String[] args) {
        phone o1=new phone();
        o1.brand="apple";
        o1.price=1700;
        o1.name="iphone";
        phone o2=new phone();
        o2.brand="samsung";
        o2.price=1200;
        o2.name="galaxy";
        o1.show();
        o2.show();
    }
}
