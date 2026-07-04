//BRUTE FORCE APPROACH 

class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int product=1;
            for(int j=i;j<nums.length;j++)
            {
                product*=nums[j];
                maxProduct=Math.max(product,maxProduct);
            }
        }
        return maxProduct;
        
    }
}

//OPTIMAL APPROACH 

class Solution {
    public int maxProduct(int[] nums) {
       int maxProduct=Integer.MIN_VALUE;
       int prefix=1;
       int suffix=1;
       for(int i=0;i<nums.length;i++)
       {
        if(prefix==0)
        {
            prefix=1;
        }
        if(suffix==0)
        {
            suffix=1;
        }
        prefix*=nums[i];
        suffix*=nums[nums.length-i-1];
        maxProduct=Math.max(maxProduct,Math.max(prefix,suffix));

       }
       return maxProduct;
        
    }
}
