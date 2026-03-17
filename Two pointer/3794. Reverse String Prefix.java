class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sp = new StringBuilder();
        sp.append(s);
        for(int i = 1; i <= k; i++){
            sp.setCharAt(i-1,s.charAt(k-i));
        }
        return sp.toString();
    }
}
