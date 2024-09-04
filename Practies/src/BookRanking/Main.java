package BookRanking;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set <Book> books=new TreeSet<>();
        books.add(new Book("Sefiller",200,"Victor hugo","2020"));
        books.add(new Book("80 alemde devri alem ",200,"Victorr","2020"));
        System.out.println("Total : " + books.size());
        System.out.println("-----------");
        Iterator <Book> iterator= books.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
