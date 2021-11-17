import java.util.Scanner;

public class strSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        String[] nList = new String[n];
        String[] yList = new String[y];
        for(int j =0; j<n;j++) {
            nList[j] = sc.nextLine();
        }
        for(int i=0; i<y;i++) {
            yList[i] = sc.nextLine();
        }
        int count = 0;
        for(int i =0; i<n;i++) {
            for(int j =0; j<y;j++) {
                if(nList[i].indexOf(yList[j]) != -1) {
                    count++;
                }

            }
        }
        System.out.print(count);
    }
}
