package Day13;
//soulution 2- accepted
public class minFallingPath  {
    public static int minFallingPathSum(int[][] matrix) {
       int m = matrix.length;
       int n = matrix[0].length;
       
       int[][] dp = new int[m][n];
       for(int i = 0 ; i < m ; i++)
           for(int j = 0 ; j < n ; j++)
               dp[i][j] = -1;
       
       int min = Integer.MAX_VALUE;
        //itrerating for all inital row points
       for(int j = 0 ; j < n ; j++)
           min = Math.min(min , minPath(matrix , m , n , 0 , j , dp));
       return min;
   }
         
   
public static int minPath(int[][] matrix, int m, int n , int i, int j , int[][] dp){
    if(i>=m || j<0 || j>=n)
           return Integer.MAX_VALUE-1000; // to prevent overflow
     
   
   
   //at last row(m-1 th)
    if(i == m-1){
           return matrix[i][j];
       } // an integer value
   
   if(dp[i][j]!=-1)
       return dp[i][j];
   
   
    int dLeft = matrix[i][j] + minPath(matrix , m , n , i+1 , j-1 , dp);
    int dDown = matrix[i][j] + minPath(matrix , m , n , i+1 , j , dp);
    int dRight= matrix[i][j] + minPath(matrix , m , n , i+1 , j+1 , dp);
   
   
    // int tempSum=matrix[i][j]+minPath(matrix, m, n, i, j, dp);
    //  minPath=Math.min(minPath,tempSum);
   
  //fiding minimum of all 
   return dp[i][j]= Math.min(dDown,Math.min(dLeft,dRight));
   }
   public static void main(String[] args) {
    int A[][] = { { 1, 2, 3 },
    { 4, 5, 6 },
    { 7, 8, 9 } };
       System.out.println(minFallingPathSum(A));
   }
}
   


    

