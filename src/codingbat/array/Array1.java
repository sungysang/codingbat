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
    
    public static int[] makePi() {
        int[] pi = {3, 1, 4};
        return pi;
    }
    
    public static boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length-1] == b[b.length-1]);
    }
    
}
