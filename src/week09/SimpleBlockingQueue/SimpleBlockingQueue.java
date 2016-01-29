package week09.SimpleBlockingQueue;

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
        threadOne.start();
        threadTwo.start();
    }

    protected synchronized void add(){
        while(simpleQueue.isEmpty()){
            int num = Integer.parseInt(scanner.nextLine());
            simpleQueue.add(num);
            System.out.println(num + " is added.");
        }
        scanner.reset();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
    }

    protected synchronized void poll(){
        int removed = simpleQueue.poll();
        System.out.println(removed + " is removed.");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
    }
}
