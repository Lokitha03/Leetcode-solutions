class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String str=new String(c);
            if(!hm.containsKey(str)){
                hm.put(str,new ArrayList<>());
            }
            hm.get(str).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}