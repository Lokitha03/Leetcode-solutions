class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0)
            return true;
        int od=1;
        while(num>0){
            num-=od;
            od+=2;
        }
        return num==0?true:false;
    }
}