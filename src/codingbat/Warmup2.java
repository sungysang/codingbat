package codingbat;

public class Warmup2 {

    public static String stringTimes(String str, int n) {
        String toReturn = "";
        while (n > 0) {
            String holder = str;
            toReturn += holder;
            n -= 1;
        }
        return toReturn;
    }

    public static String frontTimes(String str, int n) {
        String toReturn = "";
        while (n > 0) {
            String holder = "";

            if (str.length() < 3) {
                holder = str;
            } else {
                holder = str.substring(0, 3);
            }
            
            toReturn += holder;
            n -= 1;
        }
        return toReturn;
    }
    
    public static int countXX(String str) {
        int xx = 0;
        for (int i = 0; i < str.length(); i ++) {

            if (i < str.length() - 1 && str.substring(i, i+2).equals("xx") ) {
                xx ++;
            }

        }
        return xx;
    }

    public static boolean doubleX(String str) {
        int first = 0;

        for (int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == 'x') {
                first ++;

                if (str.charAt(i) == 'x' && first == 1) {
                    if (i < (str.length() - 1) && str.charAt(i+1) == 'x') {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String stringBits (String str) {
        String holder = "";

        for (int i = 0; i < str.length(); i ++) {

            if ( i % 2 == 0 ) {

                holder += str.charAt(i);

            }

        }

        return holder;
    }

    public static String stringSplosion (String str) {
        String holder = "";

        for (int i = 0; i < str.length(); i ++) {

            for (int j = 0; j < i; j ++) {

                holder += str.charAt(j);

            }

        }

        for (int i = 0; i < str.length(); i ++) {

            holder += str.charAt(i);

        }

        return holder;

    }
}