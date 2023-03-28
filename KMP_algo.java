public class KMP_algo {

    public int strStr(String haystack, String needle) {

        if(needle.length()==0) return 0;
        if(haystack.length()==0) return -1;

        int lps[] = longestprefixsuffix(needle);

        int i=0;
        int j=0;
        while(i<haystack.length() && j<needle.length())
        {
            if(haystack.charAt(i)==needle.charAt(j))
            {
                i++;
                j++;
            }
            else{
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        if(j==needle.length()) return i-j;
        else return -1;             
    }

    public int[] longestprefixsuffix(String needle)
    {
        int []lps = new int[needle.length()];
        int index=0;
        for(int i=1;i<needle.length();){

            if(needle.charAt(i)==needle.charAt(index)){
                lps[i]=index+1;
                i++;
                index++;
            }
            else{
                if(index!=0){
                    index=lps[index-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    
}
