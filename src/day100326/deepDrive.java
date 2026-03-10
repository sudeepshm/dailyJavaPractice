package day100326;
class laptop{
    int price;
    String model;
    public String toString(){
        return model+":"+price;
    }
}

public class deepDrive {
    public static void main(String[] args) {
        laptop obj=new laptop();
        obj.price=1000;
        obj.model="lenovo";
        laptop obj1=new laptop();
        obj1.price=1000;
        obj1.model="lenovo";
        boolean result=obj.equals(obj1);
    }
}
