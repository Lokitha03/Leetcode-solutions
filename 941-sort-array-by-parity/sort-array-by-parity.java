class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0,mid=0,h=nums.length-1;
        while(mid<=h){
            if(nums[mid]%2==0){
                int t=nums[mid];
                nums[mid]=nums[l];
                nums[l]=t;
                l++;
                mid++;
            }
            else{
                int t=nums[mid];
                nums[mid]=nums[h];
                nums[h]=t;
                h--;
            }
        }
        return nums;
        
    }
}