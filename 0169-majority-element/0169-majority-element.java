//BRUTE FORCE APPROACH 

class Solution {
    public int majorityElement(int[] nums) {
      for(int i=0;i<nums.length;i++)
      {
        int count=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[i]==nums[j])
            {
                count++;
            }
        }
        if(count>nums.length/2)
        {
           return nums[i];
         }
        
      }
      return -1;
    }
}

//BETTER APPROACH (Hashing hashmap is used )

class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
      for(int i=0;i<nums.length;i++)
      {
        if(map.get(nums[i])>nums.length/2)
        {
            return nums[i];
        }
      }
      return -1;
    }
}

//OPTIMAL APPROACH (Moore's voting algorithm)

class Solution {
    public int majorityElement(int[] nums) {
     int el=0;
     int count=0;
     for(int i=0;i<nums.length;i++)
     {
        if(count==0)
        {
            count=1;
            el=nums[i];
        }
        else if(nums[i]==el)
        {
            count++;
        }
        else
        {
            count--;
        }
     }
     int count1=0;
     for(int i=0;i<nums.length;i++)
     {
        if(nums[i]==el)
        {
            count1++;
        }
        if(count1>nums.length/2)
        {
            return el;
        }
     }
     return -1;
    }
}
