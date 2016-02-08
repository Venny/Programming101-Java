package week09_10.SimpleBlockingQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by inspired on 25.01.16.
 */
public class SimpleBlockingQueue {
    protected Queue<Integer> simpleQueue = new LinkedList<>();
    protected Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        SimpleBlockingQueue queue = new SimpleBlockingQueue();
        Thread threadOne = new Thread(new ThreadOne(queue));
        Thread threadTwo = new Thread(new ThreadTwo(queue));
        Thread consumer = new Thread(new ThreadOne(queue));
        Thread producer = new Thread(new ThreadTwo(queue));
        threadOne.start();
        threadTwo.start();
        consumer.start();
        producer.start();
    }

    protected synchronized void add() throws InterruptedException {
        while(!simpleQueue.isEmpty()){
            wait();
        }
        int num = scanner.nextInt();
        simpleQueue.add(num);
        System.out.println(num + " is added.");
        notifyAll();
    }

    protected synchronized void poll() throws InterruptedException {
        while(simpleQueue.size() == 0){
            wait();
        }
        int removed = simpleQueue.poll();
        System.out.println(removed + " is removed.");
        notifyAll();
    }
}
