package week09.SimpleBlockingQueue;

import java.util.Queue;
import java.util.Scanner;

/**
 * Created by inspired on 25.01.16.
 */
public class ThreadOne implements Runnable {
    private SimpleBlockingQueue queue;

    public ThreadOne(SimpleBlockingQueue simpleQueue) {
        this.queue = simpleQueue;
    }

    @Override
    public void run() {
        while(true){
            queue.add();
        }
    }
}
