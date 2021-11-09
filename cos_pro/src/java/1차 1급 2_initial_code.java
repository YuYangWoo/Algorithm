package java;// You may use import as below.
//import java.util.*;

class Solution2 {
    int dx[] = {1,0,-1,0};
    int dy[] = {0,1,0,-1};
    public int solution(int n) {
        // Write code here.
        int answer = 0;
        Integer arr[][] = new Integer[n+1][n+1];
        for(int i =0; i< arr.length;i++) {
            for(int j=0; j<arr[0].length;j++) {
                if(i == 0 || j==0 || i == arr.length-1 || j == arr.length-1) {
                    arr[i][j] = 1;
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
        int n1 = 3;
        int ret1 = sol.solution(n1);

        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int n2 = 2;
        int ret2 = sol.solution(n2);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}