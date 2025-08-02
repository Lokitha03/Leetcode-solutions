class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs==null){
            return "";
        }
        String prev=strs[0];
        StringBuilder s=new StringBuilder();
        for(int i=1;i<strs.length;i++){
            String cur=strs[i];
            int j=0;
            while(j<strs[i].length()&&j<prev.length()){
                if(prev.charAt(j)==cur.charAt(j)){
                    s.append(prev.charAt(j));
                }
                else{
                    break;
                }
                j++;
            }
            prev=s.toString();
            s.setLength(0);
        }
        return prev;
    }
}