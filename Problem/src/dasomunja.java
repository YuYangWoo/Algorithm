import java.util.Scanner;

public class dasomunja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<input.length();i++) {
            if(input.charAt(i) >='A' && input.charAt(i) <='Z') {
                sb.append(Character.toLowerCase(input.charAt(i)));
            }
            else {
                sb.append(Character.toUpperCase(input.charAt(i)));
            }
        }
        System.out.print(sb.toString());
    }
}
