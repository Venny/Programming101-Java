package Week03.Monday;

/**
 * Created by inspired on 30.11.15.
 */
public class Triple <T1, T2, T3> {
    private T1 firstObj;
    private T2 secondObj;
    private T3 thirdObj;

    public Triple(T1 firstObj, T2 secondObj, T3 thirdObj) {
        this.firstObj = firstObj;
        this.secondObj = secondObj;
        this.thirdObj = thirdObj;
    }

    public void setFirstObj(T1 firstObj) {
        this.firstObj = firstObj;
    }

    public void setSecondObj(T2 secondObj) {
        this.secondObj = secondObj;
    }

    public void setThirdObj(T3 thirdObj) {
        this.thirdObj = thirdObj;
    }

    public T1 getFirstObj(){
        return firstObj;
    }

    public T2 getSecondObj(){
        return secondObj;
    }

    public T3 getThirdObj(){
        return thirdObj;
    }
}
