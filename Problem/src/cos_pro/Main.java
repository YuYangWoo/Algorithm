package cos_pro;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int[] list = new int[4];
            String input = sc.nextLine();
            for(int i =0; i< input.length();i++) {
                if(input.charAt(i) >='a' && input.charAt(i) <='z') {
                    list[0]++;
                }
                else if(input.charAt(i) >='A' && input.charAt(i) <='Z') {
                    list[1]++;
                }
                else if(input.charAt(i) == ' ') {
                    list[3]++;
                }
                else {
                    list[2]++;
                }
            }
            System.out.print(list[0] + " " + list[1] + " " + list[2] + " " + list[3]+"\n");
        }
    }
}
