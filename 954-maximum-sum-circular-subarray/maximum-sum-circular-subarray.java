class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int tot=0,curmax=0,curmin=0,maxsum=nums[0],minsum=nums[0];
        for(int n:nums){
            tot+=n;
            curmax=Math.max(n,curmax+n);
            maxsum=Math.max(curmax,maxsum);
            curmin=Math.min(n,curmin+n);
            minsum=Math.min(minsum,curmin);
        }
        if(maxsum<0)
            return maxsum;
        return Math.max(maxsum,tot-minsum);
    }
}