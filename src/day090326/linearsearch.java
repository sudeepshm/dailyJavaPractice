package day090326;
import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("linear search implementation");
        int [] arr={1,2,4,5,6,3};
        int search;
        System.out.println("enter the elemnet to found its index value");
        search=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println("elemnet found at index "+(i+1));
                break;
            }
        }
        System.out.println("the element "+search+"was not found");
    }
}
