package day130326;
import java.util.Scanner;



public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first_term=0,second_term=1;
        int n;
        System.out.println("enter how much number u want");
        n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println("fibonacci series"+first_term);
            int next_term=first_term+second_term;
            first_term=second_term;
            second_term=next_term;


        }
    }

}
