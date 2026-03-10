package day100326;
class calc{
    final  public void add(int n1,int n2){
        System.out.println("addition"+(n1+n2));
    }
    final  public void show(){
        System.out.println("in calss clac");
    }

}
final class advclass extends calc{
    public void show(){
        System.out.println("by b");
    }

}
class veradvcalc extends advclas{
    public void show(){
        System.out.println("by b");
    }
}
public class demo {
    public static void main(String[] args) {
       final int num=89;
       num=9;
       veryadvcalc b=new veryadvcalc();
       b.add(3,4);
        System.out.println(b);
    }
}
/* full illustration of final keyword
final variable-it makes variable constant ,no furthet change;
final method-it stops method overriding
final class-it stops inheritance
 */