class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int n:arr){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        int c=0;
        for(int n:arr){
            if(n==hm.get(n)){
                if(n>c)
                    c=n;
            }
        }
        if(c==0){
            return -1;
        }
        return c;
    }
}