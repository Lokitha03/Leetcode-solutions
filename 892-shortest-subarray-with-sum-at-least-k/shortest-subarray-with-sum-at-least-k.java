class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        long[] pre=new long[n+1];
        for(int i=0;i<n;i++){
            pre[i+1]=pre[i]+nums[i];
        }
        Deque<Integer> d=new LinkedList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=n;i++){
            while(!d.isEmpty()&&pre[i]-pre[d.peekFirst()]>=k){
                min=Math.min(min,i-d.pollFirst());
            }
            while(!d.isEmpty()&&pre[i]<=pre[d.peekLast()]){
                d.pollLast();
            }
            d.addLast(i);
        }
        return min==Integer.MAX_VALUE?-1:min;
        
    }
}