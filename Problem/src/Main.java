import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String a = "";
        String b = "";
        for(int i =0; i<input.length();i++) {
            a+=input.charAt(i);
            b+=input.charAt(input.length()-i-1);
        }
        if(a.equals(b)) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
    }
}
