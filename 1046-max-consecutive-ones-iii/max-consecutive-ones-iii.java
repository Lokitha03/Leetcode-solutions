class Solution {
    public int longestOnes(int[] nums, int k) {
        int zc=0,l=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zc++;
            }
            if(zc>k){
                if(nums[l]==0){
                    zc--;
                }
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}