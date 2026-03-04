package day_today;
 class calc {
    public int add(int n1,int n2){
        return n1+n2;

    }
    public int sub(int n1,int n2){
        return n1-n2;
    }

}
class advcalc extends calc{
    public int multi(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }
}
public class dfg {
    public static void main(String[] args) {
       advcalc as=new advcalc();
       int r1=as.add(6,7);
        System.out.println(r1);

    }
}
