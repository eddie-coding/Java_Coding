public class 3sum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0;i<n-2;i++)
        {
            if(i==0 || nums[i]>nums[i-1])
            {
                int start=i+1;
                int end=n-1;
                while(start<end)
                {
                    int sum=nums[i]+nums[start]+nums[end];
                    if(sum==0)
                    {
                        result.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    }
                    if(sum<0)
                    {
                        int currstart=start;
                        while(start<end && nums[start]==nums[currstart]) start++;
                    }
                    else
                    {
                        int currend=end;
                        while(start<end && nums[end]==nums[currend]) end--;
                    }
                }
            }
        }
        return result;
    }
    
}
