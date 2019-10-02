/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbat.array;

/**
 *
 * @author Sung
 */
public class Array1 {
    
    public static boolean firstLast6(int[] nums) {
        int inputLength = nums.length;
        if (nums[0] == 6 || nums[nums.length-1] == 6) {
            return true;
        }
        return false;
    }
    
    public static boolean sameFirstLast(int[] nums) {
        if (nums.length < 1) {
            return false;
        }
        if (nums[0] == nums[nums.length-1]) {
            return true;
        }
        return false;
    }
    
}
