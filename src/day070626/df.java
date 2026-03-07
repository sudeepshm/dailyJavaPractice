package day070626;

 class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A {
public void show(){
    System.out.println("in B");
}
        }

public class df {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
        obj=new B();
        obj.show();
    }

}
//perfect example of method overriding or polymorphism