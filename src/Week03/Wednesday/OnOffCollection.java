package Week03.Wednesday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by inspired on 05.12.15.
 */
public class OnOffCollection<E> implements Collection<E> {
    private ArrayList<E> data;

    public static void main(String[] args){
    }

    public OnOffCollection(Collection<E> data){
        this.data = new ArrayList<E>((Collection<? extends E>) Arrays.asList(data.toArray()));
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return data.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return data.iterator();
    }

    @Override
    public Object[] toArray() {
        return data.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return data.toArray(a);
    }

    @Override
    public boolean add(E e) {
        if(data.contains(e)){
            data.remove(e);
            return false;
        }
        return data.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return data.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return data.contains(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for(E item:c){
            if(data.contains(item)){
                data.remove(item);
                System.err.println("One of your elements is already added and now it's deleted from your collection." +
                        "Please note that you are able to add only unique items. ");
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return data.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return data.retainAll(c);
    }

    @Override
    public void clear() {
        data.clear();
    }
}
