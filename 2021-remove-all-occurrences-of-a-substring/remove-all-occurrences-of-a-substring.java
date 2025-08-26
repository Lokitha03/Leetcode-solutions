class Solution {
    public String removeOccurrences(String s, String part) {
        int n=part.length();
        StringBuilder st=new StringBuilder(s);
        for(int i=0;i<=st.length()-n;){
            if(st.substring(i,i+n).equals(part)){
                st.delete(i,i+n);
                i=Math.max(0,i-n);
            }
            else{
                i++;
            }
        }
        return st.toString();
    }
}