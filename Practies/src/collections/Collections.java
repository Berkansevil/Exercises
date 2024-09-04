package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Collections {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("a");
        h.add("b");
        h.add("c");
        h.add("a");
        h.add(null);
        h.remove("b");
        System.out.println(h.size());
        System.out.println(h.contains("b"));

        Iterator<String> iterator = h.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
