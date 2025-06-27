class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> l=new ArrayList<>();
        for(char c:t.toCharArray()){
            l.add(c);
        }
        for(char c:s.toCharArray()){
            if(l.contains(c)){
                l.remove((Character)c);
            }
        }
        return l.get(0);
    }
}