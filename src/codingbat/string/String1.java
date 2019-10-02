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
        if (str.length() <= 2) {
            toReturn = str;
        } else {
            toReturn += str.substring(str.length()-2);
        }
        return toReturn + toReturn + toReturn;
    }
}
