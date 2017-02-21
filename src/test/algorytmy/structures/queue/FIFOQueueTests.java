package test.algorytmy.structures.queue;

import algorytmy.structures.queue.FIFOQueue;
import algorytmy.structures.queue.Queue;
import algorytmy.structures.queue.QueueException;

/**
 * Created by RENT on 2017-02-18.
 */
public class FIFOQueueTests {
    public static void main(String[] args) throws QueueException {
        FIFOQueue queue = new FIFOQueue();
        queue.push(10);
        queue.push(1);
        queue.push(19);
        queue.push(9);
        System.out.println(queue);
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        queue.push(10);
        queue.push(1);
        queue.push(19);
        queue.push(9);
        System.out.println(queue);

        Queue clone = queue.clone();
        System.out.println(clone);
    }
}
