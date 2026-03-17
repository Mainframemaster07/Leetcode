class Solution {
    public int minFlips(String s) {
        int n = s.length();
        int diff = 0;  
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != (i % 2 == 0 ? '0' : '1')) {
                diff++;
            }
        }
        int minFlips = Math.min(diff, n - diff);
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != (i % 2 == 0 ? '0' : '1')) {
                diff--;
            }
            if (s.charAt(i) != ((i + n) % 2 == 0 ? '0' : '1')) {
                diff++;
            }
            minFlips = Math.min(minFlips, Math.min(diff, n - diff));
        }
        
        return minFlips;
    }
}
