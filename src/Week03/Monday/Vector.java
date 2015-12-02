package Week03.Monday;

import Week03.Monday.MoreGeneric.DataStructure;

import java.util.AbstractList;

/**
 * Created by inspired on 02.12.15.
 */
public class Vector<E> extends AbstractList<E> {
    private E[] data;
    private int size = 0;
    private int capacity = 10;

    public Vector(){
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        return null;
    }

    public String toString(){
        String temp = "";
        for(int i = 0; i < size(); i++){
            temp += data[i] + " ";
        }
        return temp;
    }

    public boolean add(E s){
        if(size == capacity){
            resize();
        }
        data[size] = s;
        size++;
        return true;
    }

    public void switchPlaces(int index, int index2){
        E temp = data[index];
        data[index] = data[index2];
        data[index2] = temp;
    }

    public E getElement(int index){
        if(size < capacity){
            return data[index];
        }
        return null;
    }

    private void resize() {
        capacity = capacity * 2 + 1;
        E [] temp = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
}
