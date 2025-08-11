class Solution {
    public boolean rotateString(String s, String goal) {
        boolean res=(s.length()==goal.length()) && ((s+s).contains(goal));
        return res;
    }
}