package day_03_05;
class calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
}
class advcalc extends calc{
    public double mult(int n1,int n2){
      return n1*n2;
    }
    public double div(int n1,int n2){
        return n1/n2;
    }
}
class veryadcalc extends advcalc {
    public double power(int n1,int n2){
        return Math.pow(n1,n2);
    }
}
public class demo {
    public static void main(String[] args) {
        veryadcalc obj=new veryadcalc();
        double r2=obj.power(5,6);
        System.out.println(r2);
    }
}
