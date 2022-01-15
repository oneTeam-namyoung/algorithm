package Minje;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

class LTC_two_sum {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = nums.length - 1; j > 0; j--) {
                if(nums[i] + nums[j] == target && i != j) {
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        return output;
    }
}