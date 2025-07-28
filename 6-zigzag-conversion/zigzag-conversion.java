class Solution {
    public String convert(String s, int numRows) {
        if(numRows>=s.length()||numRows==1){
            return s;
        }
        int idx=0,d=1;
        List<Character>[] l=new ArrayList[numRows];
        for(int i=0;i<numRows;i++){
            l[i]=new ArrayList<>();
        }
        for(char c:s.toCharArray()){
            l[idx].add(c);
            if(idx==0){
                d=1;
            }
            else if(idx==numRows-1){
                d=-1;
            }
            idx+=d;
        }
        StringBuilder str=new StringBuilder();
        for(List<Character> r:l){
            for(char c:r){
                str.append(c);
            }
        }
        return str.toString();
    }
}