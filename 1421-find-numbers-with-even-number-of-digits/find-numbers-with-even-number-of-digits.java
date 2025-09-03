class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            int n=nums[i];
            while(n>0){
                c++;
                n=n/10;
            }
            if(c%2==0){
                res++;
            }
        }
        return res;
    }
}