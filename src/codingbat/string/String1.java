/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbat.string;

/**
 *
 * @author Sung
 */
public class String1 {
    
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }
    
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }
    
    public static String makeTags(String tag, String word) {
        String tagFront = "<" + tag + ">";
        String tagBack = "</" + tag + ">";
        return tagFront + word + tagBack;
    }
    
    public static String makeOutWord(String out, String word) {
        String front = out.substring(0, 2);
        String back = out.substring(2);
        return front + word + back;
    }
    
    public static String extraEnd(String str) {
        String toReturn = "";
        String test = "test";
        if (str.length() <= 2) {
            toReturn = str;
        } else {
            toReturn += str.substring(str.length()-2);
        }
        return toReturn + toReturn + toReturn;
    }
    
    public static String firstTwo(String str) {
        String toReturn = "";
        if (str.length() <= 2) {
            toReturn = str;
        } else {
            toReturn = str.substring(0, 2);
        }
        return toReturn;
    }
    
    public static String firstHalf(String str) {
        return str.substring(0, (str.length()/2));
    }
    
    public static String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }
    
    public static String comboString(String a, String b) {
        if(a.length()>b.length()) {
            return b + a + "" + b;
        }
        return "" + a + b + a;
    }
    
    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
    
    public static String left2(String str) {
        if(str.length() <= 2) {
            return str;
        }
        return str.substring(2) + str.substring(0, 2);
    }
    
    public static String right2(String str) {
        if(str.length() <= 2) {
            return str;
        }
        return str.substring(str.length()-2) + str.substring(0, str.length()-2);
    }
    
    public static String theEnd(String str, boolean front) {
        if(front) {
            return str.substring(0, 1);
        }
        return str.substring(str.length() - 1);
    }
    
    public static String withouEnd2(String str) {
        if(str.length() < 3) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }
    
    public static String middleTwo(String str) {
        int middle = str.length()/2 - 1;
        return str.substring(middle, middle + 2);
    }
    
    public static boolean endsLy(String str) {
        if(str.length() < 2) {
            return false;
        }
        return str.substring(str.length() - 2).equals("ly");
    }
}
