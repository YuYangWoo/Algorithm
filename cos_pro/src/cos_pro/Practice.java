package cos_pro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class Practice {
    static class Athlete  {
        int id;
        int pw;
        public Athlete(int id, int pw) {
            this.id = id;
            this.pw = pw;
        }

    }
    static class A   {

    }
    public static void main(String[] args) {
        ArrayList<Athlete> al = new ArrayList<>();
        al.add(new Athlete(5,4));
        al.add(new Athlete(7,8));
        Iterator<Athlete> iterator = al.iterator();
        while (iterator.hasNext()) {
            Athlete abc = iterator.next();

        }
        HashSet<Integer> hs = new HashSet<>();
        hs.add(8);
        hs.add(9);
        hs.add(6);
        hs.add(5);
        hs.add(7);
        hs.stream().sorted();
        Iterator<Integer> iteratora = hs.iterator();
        while(iteratora.hasNext()) {
            Integer it = iteratora.next();
            System.out.print(it);
        }
    }
}

