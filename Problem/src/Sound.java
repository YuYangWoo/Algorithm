import java.math.BigInteger;
import java.util.Scanner;

public class Sound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        String operator = sc.nextLine();
        BigInteger b = new BigInteger(sc.nextLine());

        if(operator.equals("+")) {
            System.out.print(a.add(b));
        }
        else {
            System.out.print(a.multiply(b));
        }
    }
}
