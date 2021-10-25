import java.util.*;

public class nhn2 {
    public static void main(String[] args) {
        int[][] list = {{6,18,16,17,2,9,19},{8,2,16,3,11,6,19,15,17},{5,19,1,4,17,7},{6,16,3,6,19,14,12}};
        solution(4,3,list);
    }
    private static void solution(int numOfRegion, int numOfAttackableFrequency, int[][] frequencies) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<numOfRegion; i++) {
          int cnt = frequencies[i][0];
          for(int j=1; j<=cnt;j++) {
              if(map.containsKey(frequencies[i][j])) { //포함하면
                  int num = map.get(frequencies[i][j]);
                  map.put(frequencies[i][j], ++num);
              }
              else {
                  map.put(frequencies[i][j], 1);
              }
          }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int count = 0;
        for(Map.Entry<Integer,Integer> entry : list) {
            if(count == numOfAttackableFrequency) {
                break;
            }
            arrayList.add(entry.getKey());
            count++;
        }
        int answer = 0;
        for(int i=0; i< frequencies.length;i++) {
            for(int j =1; j< frequencies[i].length;j++) {
                if(arrayList.contains(frequencies[i][j])) {
                    answer++;
                }
            }
        }
        System.out.print(answer);
    }
    public static class info {
        Integer ind;
        Integer cnt;
        public info(Integer ind, Integer cnt) {
            this.ind = ind;
            this.cnt = cnt;
        }
    }
}
