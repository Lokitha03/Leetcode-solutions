class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[]=new int[text1.length()];
        int lon=0;
        for(char c:text2.toCharArray()){
            int cur_len=0;
            for(int i=0;i<text1.length();i++){
                if(cur_len<dp[i]){
                    cur_len=dp[i];
                }
                else if(c==text1.charAt(i)){
                    dp[i]=cur_len+1;
                    lon=Math.max(lon,cur_len+1);
                }
            }
        }
        return lon;
    }
}