package DAY140326;
import java.util.Scanner;

public class recursive {

    public static long findRecursive(int n) {

        if(n <= 1){
            return 1;
        }

        else{
            return n * findRecursive(n-1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find factorial:");

        int n = sc.nextInt();

        long result = findRecursive(n);

        System.out.println("Factorial of " + n + " is " + result);
    }
}