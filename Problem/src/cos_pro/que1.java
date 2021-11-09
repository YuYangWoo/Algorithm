package cos_pro;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class que1 {
    public int solution(int K, String[] words) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int i=0;
        while(true) {
            int flag = 0;
            int count = words[i].length();
            for(int j = i+1; j< words.length;j++) {
                flag = j;
                if(count + words[j].length()+1 <= K) {
                    System.out.println(count);
                    count += words[j].length()+1;
                } else {
                    answer++;
                    i=j;
                    break;
                }
            }
            if(flag == words.length-1) {
                break;
            }
        }

        return answer+1;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        que1 sol = new que1();
        int K = 10;
        String[] words = {new String("nice"), new String("happy"), new String("hello"), new String("world"), new String("hi"), new String("abcdefg"), new String("asdfsda"), new String("ab")};
        int ret = sol.solution(K, words);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소의 반환 값은 " + ret + " 입니다.");
    }
}