package test.algorytmy.structures.queue;

import algorytmy.structures.queue.LIFOQueue;
import algorytmy.structures.queue.Queue;
import algorytmy.structures.queue.QueueException;

/**
 * Created by RENT on 2017-02-18.
 */
public class LIFOQueueTests {
    public static void main(String[] args)  {
        Queue queue = new LIFOQueue();
        try {
            queue.pop();
        } catch (QueueException e) {
            e.printStackTrace();
        }
        System.out.println();

        queue.push(3);
        queue.push(4);
        queue.push(2);
        queue.push(-1);
        System.out.println(queue);

        Queue clonedQueue = queue.clone();
        System.out.println(clonedQueue);

//        System.out.println(queue.pop()); //poprawnosc pop
//        System.out.println(queue.pop()); //poprawnosc pop
        System.out.println(queue); //czy elelmenty zostaly usuniete
    }
}
