package cos_pro;

import java.lang.*;
import java.util.*;

public class Transform {
    public static void main(String[] args) {
        System.out.println("// Long to Int");
        long a = 754L;
        System.out.println((int) a);

        System.out.println("// Long to String");
        String longToString = String.valueOf(a);
        System.out.println(longToString);

        System.out.println("// String to Int");
        int stringToInt = Integer.parseInt(longToString);
        System.out.println(stringToInt);

        System.out.println("// String to Long");
        long stringToLong = Long.parseLong(longToString);
        System.out.println(stringToLong);

        System.out.println("// String to double");
        double stringToDouble = Double.parseDouble(longToString);
        System.out.println(stringToDouble);

        System.out.println("// Int to String");
        String intToString = String.valueOf(stringToInt);
        System.out.println(intToString);

        System.out.println("// Int to Long");
        long intToLong = (long) stringToInt;
        System.out.println(intToLong);

        System.out.println("// Double to Int");
        int doubleToInt = (int) stringToDouble;
        System.out.println(doubleToInt);

        System.out.println("// Double to String");
        String doubleToString = String.valueOf(stringToDouble);
        System.out.println(doubleToString);

        char b = 'a';
        System.out.println((int)b);
        String.valueOf(b);
    }
}
