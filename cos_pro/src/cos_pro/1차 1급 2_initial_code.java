package cos_pro;// You may use import as below.
//import java.util.*;

class Solution2 {
    int dx[] = {0,1,0,-1};
    int dy[] = {1,0,-1,0};
    public int solution(int n) {
        // Write code here.
        int answer = 0;
        int cur_dir = 0,cx = 1,cy =1 ;

        int[][] arr = new int[n+2][n+2];
        for(int i =0; i< arr.length;i++) {
            for(int j=0; j<arr[0].length;j++) {
                if(i == 0 || j==0 || i == arr.length-1 || j == arr.length-1) {
                    arr[i][j] = 1;
                }
            }
        }
        for(int i = 1; i<=n*n; i++) {
            int ix = cx + dx[cur_dir];
            int iy = cy + dy[cur_dir];
            arr[cx][cy] = i;
            if(arr[ix][iy] != 0) {
                cur_dir = (cur_dir+1)%4;
            }
            cx = cx + dx[cur_dir];
            cy = cy + dy[cur_dir];
        }
        for(int i =1; i< arr.length-1;i++) {
            for(int j=1; j<arr[0].length-1;j++) {
                if(i == j) {
                    answer+= arr[i][j];
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int n1 = 6;
        int ret1 = sol.solution(n1);

        int z = 3;
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int n2 = 2;
        int ret2 = sol.solution(n2);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}