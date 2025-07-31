class Solution {
    public boolean squareIsWhite(String coordinates) {
        char m=coordinates.charAt(0);
        char n=coordinates.charAt(1);
        if(m=='a'||m=='c'||m=='e'||m=='g'){
            if(n=='1'||n=='3'||n=='5'||n=='7'){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            if(n=='2'||n=='4'||n=='6'||n=='8'){
                return false;
            }
            else{
                return true;
            }
        }
    }
}