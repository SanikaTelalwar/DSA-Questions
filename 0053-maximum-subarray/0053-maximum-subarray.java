class Solution {
    public int maxSubArray(int[] nums) {
       int sum=0;
       int maximum_sum=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++)
       {
         sum+=nums[i];
         if(sum>maximum_sum)
         {
            maximum_sum=sum;
         }
         if(sum<0)
         {
            sum=0;
         }
       }
       return maximum_sum;
    }
}