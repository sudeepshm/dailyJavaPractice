package day04;
class operation{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1,int n2){
        return n1+n2;
    }
}

public class caluclator {
    public static void main(String[] args) {
        operation opr=new operation();
       int  r1=opr.add(2,3);
       int r2=opr.add(1,2,3);
       double r3=opr.add((int) 1.2,2);
        System.out.println("======method overloading demonstration====");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }

}
