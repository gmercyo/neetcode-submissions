class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        var checked = new HashMap<Integer, Integer>();
        int[] solution = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            
            if (checked.containsKey(diff)) {
                solution[0] = checked.get(diff);
                solution[1] = i;
                return solution;
            } else {
                checked.put(nums[i], i);
            }
        }
        return solution;
    } 
}
 // for each item in nums
            // find diff between target - item
            // if, diff is in our var 'checked' = new HashMap<Integer, Integer>(nums[i], index) 
                // return int[] (i, checked.get(nums[i]))
            // else { checked.put(checked.get(nums[i]), i)}
