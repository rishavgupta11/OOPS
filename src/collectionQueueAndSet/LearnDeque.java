package collectionQueueAndSet;

import java.util.ArrayDeque;

public class LearnDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("queue "+q);

        System.out.println(q.poll());
        System.out.println(q.pop());







//        dq.offer(10);
//        dq.offerLast(20);
//        dq.offerFirst(30);

//        System.out.println(dq);

//        System.out.println(dq.poll());
//        System.out.println(dq.pollLast());
//        System.out.println(dq);

//        System.out.println(dq.peekLast());
    }
}
