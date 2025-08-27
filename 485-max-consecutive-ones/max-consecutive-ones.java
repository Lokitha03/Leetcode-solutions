class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=Integer.MIN_VALUE,c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }else{
                c=0;
            }
            res=Math.max(c,res);
        }  
        return res;
    }
}