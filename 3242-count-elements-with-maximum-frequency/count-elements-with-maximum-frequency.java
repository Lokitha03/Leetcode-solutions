class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int max=0,c=0;
        for(int f:hm.values()){
            max=Math.max(max,f);
        }
        for(int n:hm.values()){
            if(max==n)
                c+=n;
        }
        return c;
    }
}