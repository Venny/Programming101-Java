package week08.Friday.SimpleThread;

/**
 * Created by inspired on 22.01.16.
 */
public class SimpleThread implements Runnable {
    public void run(){
        System.out.println("Hello from the Thread.");
    }

    public static void main(String[] args){
        (new Thread(new SimpleThread())).start();
    }
}
