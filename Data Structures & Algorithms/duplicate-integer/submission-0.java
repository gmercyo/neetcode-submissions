class Solution {
    public boolean hasDuplicate(int[] nums) {
        // create a hashset to hold the unique ints in nums

        // loop through the array of nums
        // check if the num exists in our hashset, return true if so

        // if not, add each num to the HashSet (unique array)
        // exit function to return false

        HashSet<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);
        }
        return false;
    }
}