//BRUTE FORCE APPROACH
class Solution {
    public int[] twoSum(int[] nums, int target) {
       for(int i=0;i<nums.length;i++)
       {
          for(int j=0;j<nums.length;j++)
          {
            if(i==j)
            {
                continue;
            }
            if(nums[i]+nums[j]==target)
            {
                return new int[]{i,j};
            }
          }
       }
       return new int[]{};
    }
}

//BETTER APPROACH 

class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
          int value=target-nums[i];
          if(map.containsKey(value))
          {
            return new int[] { map.get(value), i };
          }
          map.put(nums[i],i);
       }
       return new int[]{};
    }
}

//OPTIMAL APPROACH

