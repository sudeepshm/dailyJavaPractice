package sdreo;
class a {
    public a (){
        System.out.println("in a ");
    }
    public a (int n){
        System.out.println("in int a ");
    }

}
class b extends a {
public b(){
    System.out.println("in b");
}
public b(int n){
    super(n);
    System.out.println("in int b");
}
}

public class dfd {
    public static void main(String[] args) {
        b obj=new b(7);
    }
}
