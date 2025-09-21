class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder st=new StringBuilder();
        StringBuilder str=new StringBuilder();
        for(String s:word1){
            st.append(s);
        }
        for(String s:word2){
            str.append(s);
        }
        return st.toString().equals(str.toString())?true:false;
    }
}