import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Transform {
    public static void main(String[] args) {
        String binary = Integer.toBinaryString(127);
        String octal = Integer.toOctalString(127);
        String hex = Integer.toHexString(127);
        System.out.println(binary);
        System.out.println(octal);
        System.out.println(hex);
        int b = Integer.parseInt(binary, 2);
        int c = Integer.parseInt(octal,8);
        System.out.println(b);
        System.out.println(c);
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        Iterator<Integer> iterator = hs.iterator();
        while(iterator.hasNext()) {
            Integer a = iterator.next();
            System.out.print(a);
        }
        HashSet<Shop> hss = new HashSet<>();
        hss.add(new Shop(5,3));
        hss.add(new Shop(7,5));
        Iterator<Shop> iter = hss.iterator();
        while(iter.hasNext()) {
            Shop shop = iter.next();
            System.out.print(shop.pos + shop.data);
        }

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("dd",5);
        hm.put("빠끄",7);
        if(hm.containsKey("빠끄")) {
            hm.replace("빠끄", hm.get("빠끄")+1);
        }
        System.out.print(hm.toString());
//       int a=5,c=10;
//       System.out.print(gcd(a,c));
    }

    public static class Shop {
        int pos;
        int data;
        public Shop(int pos, int data) {
            this.pos = pos;
            this.data = data;
        }
    }
}
