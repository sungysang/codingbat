/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbat;

/**
 *
 * @author Sung
 */
public class Warmup1 {
    public static String front3(String str) {
        String toReturn = "";
        if (str.length() <= 3) {
            toReturn = str;
        } else {
            toReturn = str.substring(0,3);
        }
        return toReturn + toReturn + toReturn;
    }
    
    public static String backAround(String str) {
        String last = String.valueOf(str.charAt(str.length()-1));
        return last + str + last;
    }
    
    public static boolean or35(int n) {
        if(n%3 == 0 || n%5 == 0) {
            return true;
        }
        return false;
    }
    
    public static String front22(String str) {
        String frontback = "";
        if (str.length() >= 2) {
            frontback = str.substring(0, 2);
        } else {
            frontback = str;
        }
        return frontback + str + frontback;
    }
    
    public static boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }
        return str.substring(0, 2).equals("hi");
    }
    
    public static boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
    }
    
    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }
}
