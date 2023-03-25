package binary_search;

public class median_of_sorted_arrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        if(nums1.length > nums2.length) return findMedianSortedArrays(nums2,nums1);

        int x=nums1.length;
        int y=nums2.length;
        int low=0;
        int high=x;

        while(low<=high)
        {
            int partitionx= (low+high)/2;
            int partitiony= (x+y+1)/2 - partitionx;
            int maxleftx = (partitionx == 0)? Integer.MIN_VALUE:nums1[partitionx-1];
            int minrightx = (partitionx == x)? Integer.MAX_VALUE:nums1[partitionx];
            int maxlefty = (partitiony == 0)? Integer.MIN_VALUE:nums2[partitiony-1];
            int minrighty = (partitiony == y)? Integer.MAX_VALUE:nums2[partitiony];

            if(maxleftx <= minrighty && maxlefty <= minrightx)
            {
                if((x+y)%2 == 0)
                {
                    return ((double)Math.max(maxleftx,maxlefty) + Math.min(minrightx,minrighty))/2;
                }
                else return (double)Math.max(maxleftx,maxlefty);
            }
            else if(maxleftx > minrighty)
            {
                high = partitionx-1;
            }
            else low = partitionx+1;
        }
        return 0;
    }
    
}
