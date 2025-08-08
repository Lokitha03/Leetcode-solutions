class Solution {
    public int longestWPI(int[] hours) {
        int sum=0,max=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<hours.length;i++){
            sum+=hours[i]>8?1:-1;
            if(sum>0){
                max=i+1;
            }
            else{
                if(hm.containsKey(sum-1)){
                    max=Math.max(max,i-hm.get(sum-1));
                }
            }
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }
        }
        return max;
    }
}