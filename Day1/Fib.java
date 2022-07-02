package Day1;
class Solution {
    public static int fib(int n) {
        
       int[] dp= new int[n+1]; 
    dp[0]=0;
        dp[1]=1;
        if(n==0 || n==1) return n;
for(int i=2; i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        
    }
    public static void main(String[] args) {
        int n = 9;
    System.out.println(fib(n));
    }
    
    
}