import java.util.Scanner;

public class AirthmeticSlice {
        public static int numberOfArithmeticSlices(int[] nums) {
         int[] DP= new int[nums.length]; 
         int count=0;
            for(int i=2; i<nums.length; i++){
            int diff=nums[i]-nums[i-1];
            if(diff==nums[i-1]- nums[i-2]){
                //previous series grown +1 new ap
                DP[i]=DP[i-1]+1;
             count=DP[i]+count;
            } ;
             
            }
           return count;
        }
 public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the length of your array");
     int n= sc.nextInt();
     int[] nums= new int[n];
     for(int i=0; i<n; ++i){
     nums[i]=sc.nextInt();
     }
System.out.println(numberOfArithmeticSlices(nums));
 }
    }

