class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> t=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<names.length;i++){
            t.put(heights[i],names[i]);
        }
        String[] s=new String[names.length];
        int i=0;
        for(int c:t.keySet()){
            s[i]=t.get(c);
            i++;
        }
        return s;        
    }
}