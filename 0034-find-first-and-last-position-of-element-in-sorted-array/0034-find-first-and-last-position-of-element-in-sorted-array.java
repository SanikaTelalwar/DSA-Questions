class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstOccurance(nums,target);
        int last=lastOccurance(nums,target);
        return new int[]{first,last};
        
    }
    int firstOccurance(int[] nums,int x)
    {
        int low=0;
        int high=nums.length-1;
        int first=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==x)
            {
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
           
        }
         return first;
    }

    int lastOccurance(int[] nums,int x)
    {
        int low=0;
        int high=nums.length-1;
        int last=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==x)
            {
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return last;
    }
}