class Solution {
    public int maxDepth(String s) {
        int maxNesting=0;
        int current=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                current++;
            }
            else if(s.charAt(i)==')')
            {
                current--;
            }
            maxNesting=Math.max(current,maxNesting);
        }
        return maxNesting;
        
    }
}