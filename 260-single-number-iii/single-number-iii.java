class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        int[] a=new int[2];
        int i=0;
        for(int n:nums){
            if(hm.get(n)==1){
                a[i]=n;
                i++;
            }
        }
        return a;
    }
}