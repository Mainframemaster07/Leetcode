class Solution {
    public int removeDuplicates(int[] nums) {
           HashSet<Integer> hs=new LinkedHashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int c=0;
        for(int i:hs){
            nums[c]=i;
            c++;
        }
        return c;
    }
}
