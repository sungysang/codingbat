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
    
    public static boolean love6 (int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        }
        if (a + b == 6 || Math.abs(a - b) == 6) {
            return true;
        }
        return false;
    }
    
    public static boolean in1To10 (int n, boolean outsideMode) {
        if (outsideMode == false && n >= 1 && n <= 10) {
            return true;
        }
        if (outsideMode == true && (n <= 1 || n >= 10)) {
            return true;
        }
        return false;
    }
    
    public static boolean specialEleven (int n) {
        return n % 11 == 0 || n % 11 == 1;
    }
    
    public static boolean more20 (int n) {
        return n % 20 == 1 || n % 20 == 2;
    }
    
    public static boolean old35 (int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return false;
        }
        return n % 3 == 0 || n % 5 == 0;
    }
    
    public static boolean less20 (int n) {
        return n % 20 == 19 || n % 20 == 18;
    }
    
    public static boolean nearTen (int num) {
        return num % 10 == 1 || num % 10 == 2 || num % 10 == 9 || num % 10 == 8 || num % 10 == 0;
    }

    public static int teenSum (int a, int b) {
        boolean luckyA = ( a >= 13 && a <= 19 );
        boolean luckyB = ( b >= 13 && b <= 19 );

        if ( luckyA || luckyB ) {
            
            return 19;

        }

        return a + b;
    }

    public static boolean answerCell (boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning) {
            if (isMom) {
                return true;
            }
            return false;
        }
        return true;
    }
}
