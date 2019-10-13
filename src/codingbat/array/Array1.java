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
    
    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }
    
    public static int[] rotateLeft3(int[] nums) {
        int[] rotated = {nums[1], nums[2], nums[0]};
        return rotated;
    }
    
    public static int[] reverse3(int[] nums) {
        int[] reversed = {nums[2], nums[1], nums[0]};
        return reversed;
    }
    
    public static int[] maxEnd3(int[] nums) {
        int largest;
        if(nums[0] > nums[2]) {
            largest = nums[0];
        } else {
            largest = nums[2];
        }
        int[] larger = {largest, largest, largest};
        return larger;
    }
    
    public static int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return nums[0] + nums[1];
    }
    
    public static int[] middleWay(int[] a, int[] b) {
        int[] middle = {a[1], b[1]};
        return middle;
    }
    
    public static boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
    }
    
    public static int[] makeEnds(int[] nums) {
        int[] truncated = new int[2];
        truncated[0] = nums[0];
        if(nums.length == 1) {
            truncated[1] = nums[0];
        } else{
            truncated[1] = nums[nums.length - 1];
        }

        return truncated;
    }
    
    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0) {
            for (int i : a) {
                if (i == 1) {
                    count ++;
                }
            }
        }
        if (b.length > 0) {
            for (int i : b) {
                if (i == 1) {
                    count ++;
                }
            }   
        }
        return count;
    }
    
    public static int[] biggerTwo (int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if (sumA > sumB || sumA == sumB) {
            return a;
        }
        return b;
    }
    
    public static int[] makeMiddle (int[] nums) {
        int[] middle = new int[2];
        middle[0] = nums[nums.length / 2 - 1];
        middle[1] = nums[nums.length / 2];
        return middle;
    }
    
    public static int[] plusTwo (int[] a, int[] b) {
        int[] c = new int[4];
        c[0] = a[0];
        c[1] = a[1];
        c[2] = b[0];
        c[3] = b[1];
        return c;
    }
    
    public static int[] swapEnds (int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];
        nums[0] = last;
        nums[nums.length - 1] = first;
        return nums;
    }
}
