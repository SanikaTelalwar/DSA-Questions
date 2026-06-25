//BRUTE FORCE APPROACH 
class Solution {
    public int[] rearrangeArray(int[] nums) {
    ArrayList<Integer> positive=new ArrayList<>();
    ArrayList<Integer> negative=new ArrayList<>();
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]>0)
        {
            positive.add(nums[i]);
        }
        else
        {
            negative.add(nums[i]);
        }
    }
   for(int i=0;i<nums.length/2;i++)
   {
      nums[2*i]=positive.get(i);
      nums[2*i+1]=negative.get(i);
   }
    return nums;
        
    }
}

//OPTIMAL APPROACH 

class Solution {
    public int[] rearrangeArray(int[] nums) {
    int[] result=new int[nums.length];
    int posIndex=0;
    int negIndex=1;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]>0)
        {
            result[posIndex]=nums[i];
            posIndex+=2;
        }
        else
        {
            result[negIndex]=nums[i];
            negIndex+=2;
        }
    }
    return result;
    }
}
