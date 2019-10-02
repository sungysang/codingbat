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
}
