class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        for(int num:hs){
            if(!hs.contains(num-1)){
                int cur_num=num;
                int c=1;
                while(hs.contains(cur_num+1)){
                    cur_num++;
                    c++;
                }
                res=Math.max(res,c);
            }
        }
        return res;
    }
}