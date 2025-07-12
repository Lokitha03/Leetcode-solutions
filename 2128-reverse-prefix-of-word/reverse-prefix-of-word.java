class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        StringBuilder s=new StringBuilder();
        int c=0;
        for(int i=0;i<word.length();i++){
            s.append(word.charAt(i));
            if(word.charAt(i)==(ch)){
                sb.append(word.substring(i+1,word.length()));
                c++;
                break;
            }
        }
        s.reverse();
        s.append(sb);
        if(c==0){
            return word;
        }
        return s.toString();
    }
}