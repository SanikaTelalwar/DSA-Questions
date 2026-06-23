//BRUTE FORCE APPROACH
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int prev=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]!=prev)
            {
                count++;
                prev=nums[i];
            }
            if(count==3)
            {
                return nums[i];
            }
        }
        return nums[nums.length-1];
        
    }
}

//OPTIMAL APPROACH 

class Solution {
    public int thirdMax(int[] nums) {
        long largest = Long.MIN_VALUE;
        long slargest = Long.MIN_VALUE;
        long tlargest = Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if (nums[i] == largest || nums[i] == slargest ||nums[i] == tlargest)
            {
                continue;
            }
            if(nums[i]>largest)
            {
                tlargest = slargest;
                slargest = largest;
                largest = nums[i];
            }
            else if(nums[i]>slargest)
            {
                tlargest = slargest;
                slargest=nums[i];
            }
            else if(nums[i]>tlargest)
            {
                tlargest=nums[i];
            }
            
        }
        if (tlargest == Long.MIN_VALUE) {
            return (int)largest;
        }
        return (int)tlargest;
       
        
    }
}
