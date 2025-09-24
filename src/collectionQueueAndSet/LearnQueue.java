package collectionQueueAndSet;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.offer(40); // this will also add a element

        System.out.println(q);

        System.out.println(q.poll()); // first in first out
        System.out.println(q);
        System.out.println(q.peek()); // just tell which needs to remove next
        System.out.println(q);
    }
}
