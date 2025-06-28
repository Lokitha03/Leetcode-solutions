class Solution {
    public int minMoves2(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        int middle=nums[nums.length/2];
        for(int i=0;i<nums.length;i++){
            c=c+Math.abs(nums[i]-middle);
        }
        return c;
    }
}