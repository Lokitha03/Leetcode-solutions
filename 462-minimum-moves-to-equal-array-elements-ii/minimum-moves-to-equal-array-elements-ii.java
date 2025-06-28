class Solution {
    public int minMoves2(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        int middle=nums[nums.length/2];
        for(int i:nums){
            c=c+Math.abs(i-middle);
        }
        return c;
    }
}