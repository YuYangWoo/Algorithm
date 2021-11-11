package cos_pro;

import java.util.Locale;

public class Prac {
    public static void main(String[] args) {
        String str = "apple";
        boolean startsWith = str.startsWith("a");
        System.out.println("startsWith : " + startsWith);
        String str1 = "abcdefg";
        boolean endWith = str1.endsWith("g");
        System.out.println("endsWith : " + endWith);
        String str2 = "codingTest";
        System.out.println("str2는 codingTest와 같은가? :" + str2.equals("codingTest"));
        String str3 = "chocolate";
        int indexOf = str3.indexOf("late");
        System.out.println("indexOf : " + indexOf);

        String str4 = "chocolate";
        int lastIndexOf = str4.lastIndexOf("te");
        System.out.println("lastIndexOf : " + lastIndexOf);

        String str5 = "chocolate";
        int length = str5.length();
        System.out.println("length : " + length);
        //스트림 공부

        String str6 = "chocolate";
        String replaceStr6 = str6.replace("o","O");
        System.out.println("replace : " + replaceStr6);
        String str7 = "i will test coding test tomorrow";
        String[] splitedStr7 = str7.split(" ");
        for(String a:splitedStr7) {
            System.out.println(a);
        }
        String str8 = "abcdefedcba";
        String substringStr8 = str8.substring(3,8);
        System.out.println(substringStr8);

        String str9 = "ABCDEFG";
        String lowerCaseStr9 = str9.toLowerCase();
        System.out.println(lowerCaseStr9);

        String str10 = "     i love you    ";
        String trimStr10 = str10.trim();
        System.out.println(trimStr10);
        int n = 5;
        long n1 = 8;
        double n2 = 13.58;
        System.out.println(String.valueOf(n));
        System.out.println(String.valueOf(n1));
        System.out.println(String.valueOf(n2));

        String str11 = "Christmas";
        System.out.println(str11.contains("ris"));

        String str12 = "Christmas";
        String concatStr12 = " tree";
        System.out.println(str12.concat(concatStr12));
        String str13 = "Christmas";
        System.out.println(str13.charAt(2));

        double number = 13.7896;
        String answer = String.format("%.3f", number);
        System.out.println(answer);
    }
}
