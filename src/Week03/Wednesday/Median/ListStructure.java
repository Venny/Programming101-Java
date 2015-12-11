package Week03.Wednesday.Median;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by inspired on 07.12.15.
 */
public class ListStructure implements Statistics {
    private LinkedList<Integer> list;
    private boolean sorted = false;

    public ListStructure(){
        list = new LinkedList<>();
    }

    public ListStructure(int item){
        list = new LinkedList<>();
        list.add(item);
    }

    public void add(int item){
        list.add(item);
    }

    @Override
    public int getMean() {
        int temp = 0;
        for(int item:list){
            temp += item;
        }
        return temp / 9;
    }

    @Override
    public int getMedian() {
        if(!sorted){
            sort();
        }
        int index = (list.size() + 1) / 2;
        return list.get(index);
    }

    @Override
    public int getMode() {
        if(!sorted){
            sort();
        }


        return 0;
    }

    @Override
    public int getRange() {
        return 0;
    }

    private void sort(){
        Collections.sort(list);
        sorted = true;
    }
}
