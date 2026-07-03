//BRUTE FORCE APPROACH 

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
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
            if(count>nums.length/3 && !list.contains(nums[i]))
            {
                list.add(nums[i]);
            }
        }
        return list;
            
        
    }
}

//BETETR APPROACH 

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])>nums.length/3 && !list.contains(nums[i]))
            {
                list.add(nums[i]);
            }
        }
        return list;
            
        
    }
}

//OPTIMAL APPROACH 

