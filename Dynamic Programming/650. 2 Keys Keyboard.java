class Solution {
    public int minSteps(int n) {
        if(n==1) return 0;
        int a=0,b=2;
        while(n>1){
            while(n%b == 0){
                a+=b;
                n = n/b;
            }
            b++;
        }
        return a;
    }
}
