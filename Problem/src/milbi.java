import java.util.Scanner;

public class milbi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String input = sc.nextLine();
            if(input.equals("END")) {
                break;
            }
            for(int i = input.length()-1; i>=0;i--) {
                System.out.print(input.charAt(i));
            }
            System.out.println();
        }
    }
}
