import java.util.HashMap;

class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int total = 0;
for (int ans : answers) {
            if (!map.containsKey(ans) || map.get(ans) == 0) {
                total += ans + 1;
                map.put(ans, ans); 
            } else {
                map.put(ans, map.get(ans) - 1);
            }
        }

        return total;
    }
}
