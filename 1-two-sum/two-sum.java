class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=target-nums[i];
            if(hm.containsKey(num)){
                return new int[]{i,hm.get(num)};
            }
            hm.put(nums[i],i);
        } 
        return new int[] {};
    }
}