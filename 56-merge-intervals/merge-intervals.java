class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> merge=new ArrayList<>();
        int[] cur=intervals[0];
        merge.add(cur);
        for(int[] num:intervals){
            if(cur[1]>=num[0]){
                cur[1]=Math.max(cur[1],num[1]);
            }
            else{
                cur=num;
                merge.add(cur);
            }
        }
        return merge.toArray(new int[merge.size()][]);
    }
}