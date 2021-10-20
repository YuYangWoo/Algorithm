import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class nhn {
    public static void main(String[] args) {
        int[][] arr = {{0,1,1,0,0,0},{0,1,1,0,1,1},{0,0,0,0,1,1},{0,0,0,0,1,1},{1,1,0,0,1,0},{1,1,1,0,0,0}};
        solution(6, arr);
    }
    static int[] dx = {0,1,-1,0};
    static int[] dy = {1,0,0,-1};
    static boolean[][] check;
    static ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private static void solution(int sizeOfMatrix, int[][] matrix) {
        check = new boolean[sizeOfMatrix][sizeOfMatrix];
        for(int i=0; i<matrix.length;i++) {
            for(int j=0;j<matrix.length;j++) {
                if(!check[i][j] && matrix[i][j] == 1) {
                    bfs(i,j, matrix);
                }
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList.size());
        for(int i=0; i<arrayList.size();i++) {
            System.out.print(arrayList.get(i)+" ");
        }
    }
    static void bfs(int i, int j, int[][] matrix) {
        int count = 1;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(i,j));
        check[i][j] = true;
        while(!queue.isEmpty()) {
            int x = (int) queue.peek().a;
            int y = (int) queue.peek().b;
            queue.poll();
            for(int z =0; z<4;z++) {
                int dX = x+dx[z];
                int dY = y+dy[z];
                if(dX>=0 && dX< matrix.length && dY>=0 && dY < matrix.length) {
                    if(matrix[dX][dY] == 1 && !check[dX][dY]) {
                        queue.add(new Pair(dX,dY));
                        check[dX][dY] = true;
                        count++;
                    }
                }
            }
        }
        arrayList.add(count);
    }
    public static class Pair {
        int a;
        int b;

        public Pair(int i, int j) {
            this.a = i;
            this.b = j;
        }
    }
}
