package week02.Wednesday.StackImp;

import java.util.LinkedList;

/**
 * Created by inspired on 30.11.15.
 */
public class StackImpl implements Stack {
    private LinkedList<Integer> data;

    public StackImpl(){
        this.data = new LinkedList<>();
    }

    public void push(int element){
        data.addFirst(element);
    }

    public int pop(){
        return data.removeFirst();
    }

    public int size(){
        return data.size();
    }

    public int peek(){
        return data.getFirst();
    }

    public boolean isEmpty() {
        return data.size() == 0;
    }

    public String toString(){
        return data.toString();
    }

    public boolean empty() {
        return data.size() == 0;
    }

}
