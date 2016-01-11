package week06.Wednesday.FunnyArraySorter;

import java.util.List;

/**
 * Created by inspired on 09.01.16.
 */
public class FunnyArraySorter {
    private Integer pivot;

    public FunnyArraySorter(Integer pivot){
        this.pivot = pivot;
    }

    public interface Sort {
        public List<Integer> sort (List list);
    }

    Sort reverseSort = new Sort(){
        @Override
        public List sort(List list) {
            //list.sort();
            return list;
        }
    };

    Sort pivotSubtractionSort = new Sort(){
        @Override
        public List sort(List list) {
            return list;
        }
    };

    Sort pivotDivisionSort = new Sort(){
        @Override
        public List sort(List list) {
            return list;
        }
    };

}
