package day04;

public class array {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,};
        int nums1[]=new int[4];
        nums1[0]=1;
        nums1[1]=2;
        nums1[2]=3;
        nums1[3]=4;
        nums[2]=5;
        for(int i=0;i<=3;i++){
            System.out.println(nums[i]);
            System.out.println(nums1[i]);
        }
    }
}
