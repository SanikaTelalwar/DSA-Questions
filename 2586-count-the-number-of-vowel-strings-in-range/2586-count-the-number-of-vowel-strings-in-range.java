class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        char[] vowels={'a','e','i','o','u'};
        int count=0;
        for(int i=left;i<=right;i++)
        {
            char ch1=words[i].charAt(0);
            char ch2=words[i].charAt(words[i].length()-1);
            boolean first=false;
            boolean last=false;
            for(int j=0;j<vowels.length;j++)
            {
                if(ch1==vowels[j])
                {
                    first=true;
                }
                if(ch2==vowels[j])
                {
                    last=true;
                }
            }
            if(first && last)
            {
                count++;
            }

        }
        return count;
        
    }
}


class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++)
        {
            char ch1=words[i].charAt(0);
            char ch2=words[i].charAt(words[i].length()-1);
            if("aeiou".indexOf(ch1)!=-1 && "aeiou".indexOf(ch2)!=-1)
            {
                count++;
            }

        }
        return count;
        
    }
}
