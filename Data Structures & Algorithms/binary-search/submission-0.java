class Solution {
    public int search(int[] nums, int target) {
        // list of non-repeating numbers
        // in ascending order so left int > right int
        // target is an int
        // search the list of NR numbers for something that matches target
        // return the index (pointer value) where targrt was found in the list

        int left_pointer = 0;
        int right_pointer = nums.length - 1;

        while (left_pointer <= right_pointer) {
            int midpoint = (right_pointer + left_pointer)/2;
            if (nums[midpoint] == target) {
                return midpoint;
            } else if (nums[midpoint] < target) {
            left_pointer = midpoint + 1;
            } else {
                right_pointer = midpoint - 1;
            }
        } 
        return -1;
    }
}
