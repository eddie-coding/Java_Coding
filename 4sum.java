public class 4sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        if(nums.length<4) return result;
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3] > target) break;
            if(nums[i]+nums[n-3]+nums[n-2]+nums[n-1] < target) continue;
            System.out.println(i);
            for(int j=i+1;j<n-2;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                if(nums[i]+nums[j]+nums[j+1]+nums[j+2] > target) break;
                if(nums[i]+nums[j]+nums[n-2]+nums[n-1] < target) continue;
                System.out.println(j);
            
                int start =j+1;
                int end =n-1;
                while(start < end)
                {
                    int sum = nums[i]+nums[j]+nums[start]+nums[end];
                    if(sum>target) end--;
                    else if(sum<target) start++;
                    else
                    {
                        
                        result.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
                        do{start++;} while(start<end && nums[start]==nums[start-1]);
                        do{end--;} while(start<end && nums[end]==nums[end+1]);
                    }
                }
            }
        }
        return result;
    }
    
}
