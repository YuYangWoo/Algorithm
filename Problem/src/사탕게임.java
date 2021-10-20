import java.util.Scanner;

public class 사탕게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] arr = new char[n][n];
        for(int i = 0; i<n;i++) {
            arr[i] = sc.next().toCharArray();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i< arr.length;i++) { // 00 10 20 01 11 21
            for(int q=0; q<arr.length; q++) {
                if(q+1 <arr[0].length) {
                    if(arr[q][i] != arr[q+1][i]) {
                        char temp = arr[q][i];
                        arr[q][i] = arr[q+1][i];
                        arr[q+1][i] = temp;
                        //탐색까지. 먼저 행
                        for(int x = 0; x < arr.length; x++) { // 00 01 / 01 02
                            int count = 1;
                            for(int y = 1; y<arr[0].length;y++) {
                                if(y < arr.length) {
                                    if(arr[x][y-1] == arr[x][y]) { // 00 01 /01 02 /
                                        count++;
                                    }
                                    else {
                                        max = Math.max(max, count);
                                        count = 1;
                                    }
                                }
                            }
                            max = Math.max(max, count);
                        }
                        // 열 00 10 20 30  01 11 21 31
                        for(int x = 0; x < arr.length; x++) { //01 02 03 11
                            int count = 1;
                            for(int y = 1; y<arr.length; y++) {
                                if(y < arr.length) {
                                    if(arr[y-1][x] == arr[y][x]) {
                                        count++;
                                    }
                                    else {
                                        max = Math.max(max, count);
                                        count = 1;
                                    }
                                }
                            }
                            max = Math.max(max, count);
                        }
                        temp = arr[q+1][i];
                        arr[q+1][i] =arr[q][i];
                        arr[q][i] = temp;
                    }
                }
            }
            for(int j=0; j<arr[0].length; j++) {
                if(j+1 < arr[0].length) {
                    if(arr[i][j] != arr[i][j+1]) {
                        char temp = arr[i][j];
                        arr[i][j] = arr[i][j+1];
                        arr[i][j+1] = temp;
                        //탐색까지. 먼저 행
                        for(int x = 0; x < arr.length; x++) { // 00 01 / 01 02
                            int count = 1;
                            for(int y = 1; y<arr[0].length;y++) {
                                if(y < arr.length) {
                                    if(arr[x][y-1] == arr[x][y]) { // 00 01 /01 02 /
                                        count++;
                                    }
                                    else {
                                        max = Math.max(max, count);
                                        count = 1;
                                    }
                                }
                            }
                            max = Math.max(max, count);
                        }
                        // 열 00 10 20 30  01 11 21 31
                        for(int x = 0; x < arr.length; x++) { //01 02 03 11
                            int count = 1;
                            for(int y = 1; y<arr.length; y++) {
                                if(y < arr.length) {
                                    if(arr[y-1][x] == arr[y][x]) {
                                        count++;
                                    }
                                    else {
                                        max = Math.max(max, count);
                                        count = 1;
                                    }
                                }
                            }
                            max = Math.max(max, count);
                        }
                        temp = arr[i][j+1];
                        arr[i][j+1] =arr[i][j];
                        arr[i][j] = temp;
                    }
                }
            }
        }
        System.out.print(max);
    }
}
