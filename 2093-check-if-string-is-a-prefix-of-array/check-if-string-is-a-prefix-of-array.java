class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<words.length;i++){
            st.append(words[i]);
            if(st.toString().equals(s)&&st.length()<=s.length()){
                return true;
            }
        }
        return false;
    }
}