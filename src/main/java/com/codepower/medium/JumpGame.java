package com.codepower.medium;

/**
 * @author Justin Mathew @dev_io
 * You are given an integer array nums.
 * You are initially positioned at the array's first index,
 * and each element in the array represents your maximum jump length at that position.
 * Return true if you can reach the last index, or false otherwise.
 *
 */
public class JumpGame {
    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jumpGame.canJump(nums));
    }

    //Brute force
    public boolean canJump(int[] nums) {
        return canJumpFromPosition(0, nums);
    }

    /**
     * Intuition:
     *  Valley Peak approach.
     *  Very interesting approach where we create a valley peak approach to solve the problem.
     *  For example. [2, 3, 1, 1, 4]
     *  We create  a variable reachable = 0
     *  Reachable index is the maximum index that can be reached from the current index.
     *  If the reachable index is greater than or equal to the last index, we return true.
     *  If the current index is greater than the reachable index, we return false.
     *
     * @param i
     * @param nums
     * @return
     */
    private boolean canJumpFromPosition(int i, int[] nums) {
        int reachable=0;
        int n=nums.length;
        for(int j=0;j<n;j++){
            if(j>reachable){
                return false;
            }else{
                reachable=Math.max(reachable,j+nums[j]);
            }

        }
        return true;
    }

}
