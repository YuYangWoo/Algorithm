import java.util.Scanner;

public class AB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0; i<t;i++) {
            String input = sc.next();
            String[] answer = input.split(",");
            System.out.println(Integer.parseInt(answer[0]) + Integer.parseInt(answer[1]));
        }
    }
}
