package cos_pro;// You may use import as below.
//import java.util.*;
class Solution3 {
    int[] nightX = {2,1,-1,-2,-2,-1,1,2};
    int[] nightY = {1,2,2,1,-1,-2,-2,-1};
    public int solution(String pos) {
        // Write code here.
        int answer = 0;
        int[][] position = new int[8][8];
        int x = pos.charAt(0)-65;
        int y = Integer.parseInt(String.valueOf(pos.charAt(1)))-1;
        for(int i =0; i<8;i++) {
            int ix = x + nightX[i];
            int iy = y+ nightY[i];
            if(ix>=0 && iy>=0 &&  ix<8 && iy <8) {
                answer++;
            }
        }
        System.out.print("x는" + x + "y는" + y);
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        String pos = "D4";
        int ret = sol.solution(pos);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}