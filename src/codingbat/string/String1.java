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
    
    public static String nTwice (String str, int n) {
        String first = str.substring(0, n);
        String last = str.substring(str.length() - n);
        return first + last;
    }
    
    public static String twoChar (String str, int index) {
        if (str.length() - index < 2 || index < 0) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }
    
    public static String middleThree (String str) {
        int middleIndex = (int) Math.floor(str.length() / 2);
        return str.substring(middleIndex - 1, middleIndex + 2);
    }
    
    public static boolean hasBad (String str) {
        if (str.length() < 3) {
            return false;
        }
        if (str.substring(0, 3).equals("bad") || 
                (str.length() > 3 && str.substring(1, 4).equals("bad"))) {
            return true;
        }
        return false;
    }
    
    public static String atFirst (String str) {
        String toReturn = "";
        if (str.length() >= 2) {
            toReturn = str.substring(0, 2);
        } else {
            if (str.length() == 1) {
                toReturn = str.substring(0, 1) + "@";
            }
            
            if (str.length() == 0) {
                toReturn = "@@";
            }
        }
        return toReturn;
    }
    
    public static String lastChars (String a, String b) {
        String toReturn = "";
        
        if (a.length() == 0) {
            toReturn += "@";
        } else {
            toReturn += a.charAt(0);
        }
        
        if (b.length() == 0) {
            toReturn += "@";
        } else {
            toReturn += b.charAt(b.length() - 1);
        }
        
        return toReturn;
    }
    
    public static String conCat (String a, String b) {
        
        String template = a + b;
        String toReturn = "";
        Character g1 = new Character('g');
        
        for (int i = 0; i < template.length(); i ++) {
            if (i != template.length() - 1 && 
                    template.charAt(i) != template.charAt(i + 1) || 
                    template.charAt(i) == g1 ) {
                toReturn += template.charAt(i);
            }
            if (i == template.length() - 1) {
                toReturn += template.charAt(i);
            }
        }
        
        return toReturn;
    }
    
    public static String conCat2(String a, String b) {
        if (a.length() == 0) {
            return b;
        }
        if (b.length() == 0) {
            return a;
        }
        
        boolean hasDoubleChar = a.substring(a.length() - 1).equals(b.substring(0, 1));
        String template = "";
        
        for (int i = 0; i < a.length(); i ++) {
            if (i == a.length() - 1) {
                if (hasDoubleChar) {
                } else {
                    template += a.charAt(i);
                }
            } else {
                template += a.charAt(i);
            }
        }
        return template + b;
    }
}
