package week09.SimpleBlockingQueue;

import java.util.Queue;

/**
 * Created by inspired on 25.01.16.
 */
public class ThreadTwo implements Runnable {
    private SimpleBlockingQueue queue;

    public ThreadTwo(SimpleBlockingQueue simpleQueue) {
        this.queue = simpleQueue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                queue.poll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The Queue is empty.");
        }
    }
}
