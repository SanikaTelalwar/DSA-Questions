class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
       if(nums.length==0)
       {
        return 0;
       }
       int longest=1;
       int currCount=0;
       int lastSmaller=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]-1==lastSmaller)
        {
            currCount++;
            lastSmaller=nums[i];
        }
        else if(nums[i]!=lastSmaller)
        {
            currCount=1;
            lastSmaller=nums[i];
        }
        longest=Math.max(longest,currCount);
       }
       return longest;

    }
}

//OPTIMAL APPROACH :
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
       if(nums.length==0)
       {
        return 0;
       }
       int longest=1;
       for(int i=0;i<nums.length;i++)
       {
        set.add(nums[i]);
       }
       for(int el:set)
       {
        if(!set.contains(el-1))
        {
            int count=1;
            int x=el;
        
           while(set.contains(el+1))
           {
              el+=1;
              count++;
           }
        longest=Math.max(longest,count);
        }
       }
        return longest;

    }
   
}
