package collections;

import com.sun.source.tree.WhileLoopTree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueList {
    public static void main(String[] args) {
        Queue<String> queue =new LinkedList<>();
        queue.add("berkan");
        queue.add("sevil");
        queue.offer("ahmet");
        queue.element();
        System.out.println( queue.peek());
        System.out.println(queue.poll());

       Iterator<String> itr= queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }


}
