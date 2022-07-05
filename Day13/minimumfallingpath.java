package Day13;

import java.util.HashMap;

class Solution {
public static int minFallingPathšum(int[][] A) {
int r = A.length; 
int c = A[0].length; 
int ans = Integer.MAX_VALUE;
 HashMap<String, Integer> hm = new HashMap <>();
 for(int j = 0; j<c; j++)
ans = Math.min(ans, min(0, j, A, hm)); 
return ans;
}
private static int min(int i, int j, int arr[][], HashMap<String, Integer> hm) {
int r = arr.length;
 int c = arr[0].length;
if( i == r) 
return 0;
if(j <0 || j >=c) return Integer.MAX_VALUE;
String key = i + "creatingkey" + j;
 if(hm.containsKey (key))
return hm.get(key);

int op1 = min(i+1, j-1, arr, hm);
int op2 = min(i+1, j, arr, hm);
int op3 = min(i+1, j+1, arr, hm);
  
hm.put(key, arr[i][j] + Math.min(op1, Math.min(op2, op3)));
 return arr[i][j] + Math.min(op1, Math.min(op2, op3));

}
public static void main(String[] args) {
    int A[][] = { { 1, 2, 3 },
    { 4, 5, 6 },
    { 7, 8, 9 } };
       System.out.println(minFallingPathšum(A));
   }
}