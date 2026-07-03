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

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        int element1 = 0;
        int element2 = 0;

        int count1 = 0;
        int count2 = 0;

        // Find candidates
        for(int i = 0; i < nums.length; i++)
        {
            if(element1 == nums[i])
            {
                count1++;
            }
            else if(element2 == nums[i])
            {
                count2++;
            }
            else if(count1 == 0)
            {
                element1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0)
            {
                element2 = nums[i];
                count2 = 1;
            }
            else
            {
                count1--;
                count2--;
            }
        }

        // Verify candidates
        count1 = 0;
        count2 = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == element1)
            {
                count1++;
            }
            else if(nums[i] == element2)
            {
                count2++;
            }
        }

        if(count1 > nums.length / 3)
        {
            list.add(element1);
        }

        if(count2 > nums.length / 3)
        {
            list.add(element2);
        }

        return list;
    }
}
