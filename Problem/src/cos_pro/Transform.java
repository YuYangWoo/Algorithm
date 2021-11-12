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
        int df = 9;
        long asd = (long)df;
        aera();
        check = new boolean[5];
        answer = new int[3];
        combination(0,0);
    }
    public int gcd(int a, int b) {
        while(b>0) {
            int tmp = b;
            b=a%b;
            a=tmp;
        }
        return a;
    }
    public static void aera() {
        boolean[] prime = new boolean[30];
        prime[0]=prime[1] = true;
        for(int i =2; i*i<prime.length;i++) {
            if(!prime[i]) {
                for(int j = i*i; j< prime.length;j+=i) {
                    prime[j] = true;
                }
            }
        }
        for(int i = 0; i< prime.length;i++) {
            if(!prime[i]) System.out.println(i);
        }
    }
    static boolean[] check ;
    static int[] answer;
    public static void combination(int index, int start) {
        int[] select = {1,2,3,3,5};

        if(index == 3 ){
            for(int i =0; i<answer.length;i++) {
                System.out.print(answer[i]);
            }
            System.out.println();

            return;
        }
        for(int i =start; i<select.length;i++) {
            if(check[i]) continue;
            answer[index] = select[i];
            check[i] = true;
            combination(index +1, i);
            check[i] = false;
        }
    }
}
