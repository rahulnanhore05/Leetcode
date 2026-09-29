class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = i;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while (j < nums.length){
            sum += nums[j];
            while (sum >= target){
                min = Math.min(min, j-i+1);
                sum -= nums[i];
                i = i + 1;
            }
            j++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}