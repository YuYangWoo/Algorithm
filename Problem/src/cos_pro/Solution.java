package cos_pro;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
    int dx[] = {1,0,-1,0};
    int dy[] = {0,1,0,-1};
    public int solution(int[][] garden) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int day = 0;
        boolean check[][] = new boolean[garden.length][garden.length];
        Queue<Pos> queue = new LinkedList<>();
        int count = 0;
        for(int i =0; i<garden.length; i++) {
            for(int j=0;j<garden[0].length; j++) {
                if(garden[i][j] == 1) {
                    Pos ps = new Pos(i,j);
                    count++;
                    queue.add(ps);
                }
            }
        }
        if(count == garden.length* garden.length) {
            answer = 0;
        } else {
            answer = bfs(garden, queue, check,day);
        }
        return answer;
    }

    int bfs(int[][] garden, Queue<Pos> queue, boolean[][] check, int day) {
        check[queue.peek().a][queue.peek().b] = true;
        int queueSize = 0;
        while(!queue.isEmpty()) {
            queueSize = queue.size();
            for(int z = 0; z<queueSize;z++) {
                Pos node = queue.poll();
                for(int i =0;i<4;i++) {
                    int ix = node.a + dx[i];
                    int iy = node.b + dy[i];
                    if(ix>=0 && iy>=0 && ix <garden.length && iy < garden.length) {
                        if(!check[ix][iy] && garden[ix][iy] == 0) {
                            garden[ix][iy] = 1;
                            check[ix][iy] = true;
                            queue.add(new Pos(ix,iy));
                        }
                    }
                }
            }
            day++;
            int cnt = 0;
            for(int i =0; i< garden.length;i++) {
                for(int j =0; j<garden[0].length;j++) {
                    if(garden[i][j] == 1) {
                        cnt++;
                    }
                }
            }
            if(cnt == garden.length*garden[0].length) break;
        }

        return day;
    }

    public class Pos {
        int a;
        int b;
        public Pos(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }



    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] garden1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int ret1 = sol.solution(garden1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[][] garden2 = {{1, 1}, {1, 1}};
        int ret2 = sol.solution(garden2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

    }
}