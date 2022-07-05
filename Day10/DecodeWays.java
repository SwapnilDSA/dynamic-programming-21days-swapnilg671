package Day10;
class Solution {
   
    public static int numDecodings(String s) {
        int wayCount=0;
      
        char[] ch= s.toCharArray();
          int[] DP= new int[ch.length];
         for (int i=0; i<ch.length;++i){
            System.out.println( ch[i]);
        if(ch[i]<26 &&ch[i]>0)
            DP[i]=DP[i-1]+1;
             wayCount=DP[i];
         }
       return wayCount;
    }
    public static void main(String[] args) {
        String s="1233"; 
        // int numDecodings = new numDecodings(s);
       System.out.println(numDecodings(s));
        
    }
}