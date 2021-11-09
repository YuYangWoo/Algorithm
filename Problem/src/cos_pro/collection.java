package cos_pro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class collection {
    public static void main(String[] args) {
        Integer[] b = {1,2,3,4};
        String[] string = {"a", "b", "c", "d"};

        Arrays.sort(string, Collections.reverseOrder());
        for(int i =0; i<string.length;i++) {
            System.out.print(string[i] +" ");
        }
        System.out.println();

        Arrays.sort(b);
        for(int i =0; i<b.length;i++) {
            System.out.print(b[i] + " ");
        }

        Arrays.sort(b,Collections.reverseOrder());
        for(int i =0; i<b.length;i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        Collections.sort(arrayList);
        for(int i = 0; i<arrayList.size();i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        Collections.sort(arrayList, Collections.reverseOrder());
        for(int i = 0; i<arrayList.size();i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        String st = "abcdefg";
        st.length();

        String stArr[] = {"a","b","c","d"};
        int stArrLength = stArr.length;
        int[] arr = {1,2,3,4};
        int length = arr.length;
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.size();
        System.out.println();

    }
}
