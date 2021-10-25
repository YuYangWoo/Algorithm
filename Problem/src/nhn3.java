import java.util.ArrayList;

public class nhn3 {
    public static void main(String[] args) {
        int[][] list = {{3,6},{5,7},{4,1},{8,7}};
        solution(4, list);
    }
    static boolean[][] check;
    static int[] answerList;
    static boolean[] visit;
    static int cnt = 0;
    private static void solution(int numOfConflict, int[][] conflicts) {
        check = new boolean[9][9];
        visit = new boolean[9];
        answerList = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        for(int i=0; i<conflicts.length;i++) {
                check[conflicts[i][0]][conflicts[i][1]] = true;
                check[conflicts[i][1]][conflicts[i][0]] = true;
        }
        dfs(0);
        System.out.print(cnt);
    }

    static int dfs(int index) {
        if(index == 8) {
            for(int i=0; i<7; i++) {
                if(check[answerList[i]][answerList[i+1]]) {
                    return 0;
                }
            }
            cnt++;
        }
        for(int i=1; i<=8;i++) {
            if(!visit[i]) {
                visit[i] = true;
                answerList[index] = i;
                dfs(index + 1);
                visit[i] = false;
                answerList[index] = 0;
            }
        }
        return 0;
    }
}
