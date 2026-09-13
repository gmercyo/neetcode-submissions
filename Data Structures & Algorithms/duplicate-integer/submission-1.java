class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dups = new HashSet<Integer>();

        for (int n : nums) {
            if (dups.contains(n)) {
                return true;
            } else {
                dups.add(n);
            }
        } 
        return false;
    }
}