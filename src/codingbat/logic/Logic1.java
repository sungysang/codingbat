/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbat.logic;

/**
 *
 * @author Sung
 */
public class Logic1 {
    
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if((cigars >= 40 && cigars <= 60) || (isWeekend && cigars >= 40)) {
            return true;
        }
        return false;
    }
    
    public static int dateFashion(int you, int date) {
        if(you <= 2 || date <= 2) {
            return 0;
        }
        if(you >= 8 || date >= 8) {
            return 2;
        }
        return 1;
    }
    
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if(temp >= 60 &&
                ((isSummer && temp <= 100) ||
                (!isSummer && temp <= 90))) {
            return true;
        }
        return false;
    }
    
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if ((speed > 80 && !isBirthday) || (speed > 85 && isBirthday)) {
            return 2;
        }
        if ((speed > 60 && !isBirthday) || (speed > 65 && isBirthday)) {
            return 1;
        }
        return 0;
    }
    
    public static int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }
    
    public static String alarmClock(int day, boolean vacation) {
        boolean isWeekend = day == 0 || day == 6;
        if(isWeekend && vacation) {
            return "off";
        }
        if(isWeekend && !vacation) {
            return "10:00";
        }
        if(!isWeekend && vacation) {
            return "10:00";
        }
        return "7:00";
    }
}
