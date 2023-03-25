public class 3sum_closest {

    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length;
        Arrays.sort(nums);
        int closest= nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++)
        {
            if(i==0 || nums[i]>nums[i-1])
            {
                int start=i+1;
                int end=n-1;
                while(start<end)
                {
                    int currsum = nums[i]+nums[start]+nums[end];
                    if(currsum==target) return currsum;
                    else if(currsum<target) start++;
                    else end--;
                    if(Math.abs(target-currsum)<Math.abs(target-closest)) closest=currsum;
                }
            }
        }
        return closest;
    }
    
}
