class Solution {
    public String longestPalindrome(String s) {
        int maxLength=1;
        int start=0;
        for(int i=0;i<s.length();i++)
        {
            int left=i;
            int right=i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                int currentLength=right-left+1;
                if(currentLength>maxLength)
                {
                    maxLength=currentLength;
                    start=left;
                }
                left--;
                right++;

            }

            left=i;
            right=i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                int currentLength=right-left+1;
                if(currentLength>maxLength)
                {
                    maxLength=currentLength;
                    start=left;
                }
                left--;
                right++;
            }
        }
        return s.substring(start,start+maxLength);
        
    }
}