package java;// You may use import as below.
//import java.util.*;

class Solution1 {
    public long solution(long num) {
        // Write code here.
        long answer = 0;
        while(true) {
            num++;
            String numToString = String.valueOf(num);
                    boolean flag = false;
            for(int i=0; i<numToString.length();i++) {
                if(numToString.charAt(i) == '0') {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                answer = num;
                break;
            }
        }
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        long num = 9949999;
        long ret = sol.solution(num);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}