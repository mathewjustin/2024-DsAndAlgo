package com.codepower.medium;

/**
 * @author Justin Mathew @dev_io
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
 *
 * Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
 *
 * 0 <= j <= nums[i] and
 * i + j < n
 * Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2:
 *
 * Input: nums = [2,3,0,1,4]
 * Output: 2
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * 0 <= nums[i] <= 1000
 * It's guaranteed that you can reach nums[n - 1].
 */
public class JumpGameII {
    public static void main(String[] args) {
        JumpGameII jumpGameII = new JumpGameII();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jumpGameII.jump(nums));
    }

    private int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0;
        int currentJumpEnd = 0;
        int farthest = 0;
        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            //This if conditions checks when we actually need to jump
  /*          The if Condition:
            if (i == currentJumpEnd):
            This condition checks if the current index i has reached the end of the range that we could jump to with the current number of jumps (currentJumpEnd).
            When this condition is true,
            it means we have explored all possible places we can reach within the current jump,
            and it's time to make another jump to extend our reach. This is crucial because:

            It signals that to proceed further,
            we must increment our jump count (jumps++), as we've exhausted the reach of our current jump.
            It updates currentJumpEnd to farthest,
            which is the maximum extent we can reach with the next jump.
            This effectively sets a new target for the next set of iterations,
            aiming to see if we can further maximize our reach before making another jump.
            This if condition is pivotal for the algorithm, ensuring that we only increase our jump count when necessary (i.e., when we've maximized the distance covered by the current jump and need to jump again to move further). This strategy ensures that the algorithm finds the minimum number of jumps needed to reach the end of the array by always making the optimal jump at each step.*/
            if (i == currentJumpEnd) {
                jumps++;
                currentJumpEnd = farthest;
            }

        }
        return jumps;
    }

}


