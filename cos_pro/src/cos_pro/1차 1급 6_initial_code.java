package cos_pro;

class Solution{
    public int func(int record){
        if(record == 0) return 1; // 바위
        else if(record == 1) return 2; // 보
        return 0; // 가위
    }

    public int solution(int[] recordA, int[] recordB){
        int cnt = 0;
         //                        이이이지 이 이
//        int[] recordA = {2,0,0,0,0,0,1,1,0,0};
//        int[] recordB = {0,0,0,0,2,2,0,2,2,2};
        for(int i = 0; i < recordA.length; i++){
            if(recordA[i] == recordB[i]) //비겼으면
                continue;
            else if(recordA[i] == func(recordB[i])) // 이겼으면 10 21 02
                cnt = cnt + 3;
            else // 졌으면
                cnt = Math.max(0, cnt - 1);
        }
        return cnt;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] recordA = {2,0,0,0,0,0,1,1,0,0};
        int[] recordB = {0,0,0,0,2,2,0,2,2,2};
        int ret = sol.solution(recordA, recordB);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}