package Week03.Monday;

/**
 * Created by inspired on 30.11.15.
 */
public class Pair <T1, T2> {
    private T1 firstObj;
    private T2 secondObj;


    public Pair(T1 firstObj, T2 secondObj) {
        this.firstObj = firstObj;
        this.secondObj = secondObj;
    }

    public void setFirstObj(T1 item){
        firstObj = item;
    }

    public void setSecondObj(T2 item){
        secondObj = item;
    }

    public T1 getFirstObj(){
        return firstObj;
    }

    public T2 getSecondObj(){
        return secondObj;
    }
}
