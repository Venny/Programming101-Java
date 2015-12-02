package Week03.Monday.MoreGeneric;

import java.util.LinkedList;

/**
 * Created by inspired on 30.11.15.
 */
public class StackImpl<E> implements DataStructure<E> {
    private LinkedList<E> data;

    public StackImpl(){
        this.data = new LinkedList<>();
    }

    public void push(E element){
        data.addFirst(element);
    }

    public E pop(){
        return data.removeFirst();
    }

    public int size(){
        return data.size();
    }

    public E peek(){
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
