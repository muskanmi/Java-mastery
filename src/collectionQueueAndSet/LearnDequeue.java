package collectionQueueAndSet;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class LearnDequeue {
    public static void main(String[] args) {

//      Queue<Integer> dq = new ArrayDeque<>(); // if i will queue then only queue method will call. dequeue methods will not call.
        Deque<Integer> dq = new ArrayDeque<>();

        dq.offer(10);
        dq.offerLast(20);
        dq.offerFirst(30);

        System.out.println(dq);

    }
}
