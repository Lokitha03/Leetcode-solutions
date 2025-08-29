class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merge=new ArrayList<>();
        for(int[] num:intervals){
            if(num[1]<newInterval[0]){
                merge.add(num);
            }
            else if(num[0]>newInterval[1]){
                merge.add(newInterval);
                newInterval=num;
            }
            else{
                newInterval[0]=Math.min(newInterval[0],num[0]);
                newInterval[1]=Math.max(newInterval[1],num[1]);
            }
        }
        merge.add(newInterval);
        return merge.toArray(new int[merge.size()][]);
    }
}