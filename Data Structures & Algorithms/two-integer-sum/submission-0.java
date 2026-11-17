class Solution {
    public int[] twoSum(int[] nums, int target) {
        boolean test = false;
        int i = 0;
        while (!test && i < nums.length) {
            int c = target - nums[i];
            int j = i + 1;
            while (!test && j < nums.length) {
                if (nums[j] == c) {
                    test = true;
                    int[] res = new int[2];
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
                j++;
            }
            i++;
        }
        return new int[0];
    }
}
