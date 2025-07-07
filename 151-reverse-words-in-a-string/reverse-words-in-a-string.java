class Solution {
    public String reverseWords(String s) {
       String[] str=s.split("\\s+");
       StringBuilder n=new StringBuilder();
       for(int i=str.length-1;i>=0;i--){
        n.append(str[i]);
        if(i!=0)
            n.append(" ");
       }
       return n.toString().trim();
    }
}