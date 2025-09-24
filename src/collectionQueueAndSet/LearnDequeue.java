package collectionQueueAndSet;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class LearnDequeue {
    public static void main(String[] args) {

//      Queue<Integer> dq = new ArrayDeque<>(); // if i will queue then only queue method will call. dequeue methods will not call.
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayDeque stack = new ArrayDeque<>();

        dq.offer(10);
        dq.offerLast(20);
        dq.offerFirst(30);

        System.out.println(dq);

        System.out.println(dq.pollLast());
        System.out.println(dq);


//        we can implement stack using arraydeque

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        System.out.println(stack.pop());

    }
}
