package DP;

public class longest_palindromic_substring {

    public String longestPalindrome(String s) {

        if(s.length()<=1) return s;
        String res = null;
        int n=s.length();
        boolean[][] dp = new boolean[n][n];

        for(int i=n-1;i>=0;i--)
        {
            for(int j=i;j<n;j++)
            {
                if((s.charAt(i)==s.charAt(j)) && (j-i<3 || dp[i+1][j-1]))
                {
                    dp[i][j] = true;
                }
                if(dp[i][j] && (res==null || j-i+1>res.length())) {
                    res=s.substring(i,j+1);
                }
                 
            }
        }
        return res;
    }
    
}
