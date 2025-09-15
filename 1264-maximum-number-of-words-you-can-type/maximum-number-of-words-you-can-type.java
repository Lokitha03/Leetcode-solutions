class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] st=text.split(" ");
        int c=0;
        for(int i=0;i<st.length;i++){
            for(int j=0;j<brokenLetters.length();j++){
                char cr=brokenLetters.charAt(j);
                if(st[i].contains(String.valueOf(cr))){
                    c++;
                    break;
                }
            }
        }
        return st.length-c;
    }
}