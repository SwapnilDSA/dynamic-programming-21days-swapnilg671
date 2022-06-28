public class jumpGame {
      //I will store my maximum value in Dp array and compare the current maximum dp[i] to 
    //the previous maximum Dp[i-1], so the currrent maximum or the maximum value will depend on the value of dp[i-1], so we can store dp[i-1] in variable MaxJump
//maxJump= Math.max(maxJump, nums[i]+i);
    public static boolean canJump(int[] nums) {
        if (nums.length==1) return true;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(dp[i - 1] < i){
                return false;
            }
             //if my capcity to jump is smaller than to capacity to reach last index,i, then we will return false 
            dp[i] = Math.max(dp[i - 1], i + nums[i]);
            //maxJump= Math.max(maxJump, i+nums[i]);
        //whether we can reach to end index or not from current: i+nums[i]
        }
      
        return true;
        
    }   
     public static void main(String[] args ){
         int[] nums= {2,1,4,3,0,1};
        System.out.println(canJump(nums));
    }
}
    
