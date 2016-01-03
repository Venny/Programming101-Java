package Week03.Friday.HashMap;

/**
 * Created by inspired on 01.01.16.
 */
public class Main {
    public static void main(String[] args){
        HashMap testMap = new HashMap();
        testMap.put("test_1", 18);
        testMap.put("test_1", 3);
        testMap.put("test_2", 5);
        testMap.put("test_3", 18);
        testMap.put("test_4", 66);
        testMap.put("test_5", 13);
        testMap.put("test_6", 13);
        testMap.put("test_7", 13);
        testMap.put("test_8", 13);
        System.out.println(testMap.get("test_1"));
        System.out.println(testMap.containsKey("test_8"));
    }
}
