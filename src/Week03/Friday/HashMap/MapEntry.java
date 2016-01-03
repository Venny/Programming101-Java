package Week03.Friday.HashMap;
import java.util.Map;

/**
 * Created by inspired on 27.12.15.
 */
public class MapEntry <K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    public MapEntry(K key, V value){
        setKey(key);
        setValue(value);
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public V setValue(V value) {
        this.value = value;
        return value;
    }

    public String toString(){
        return "Key: " + key + " Value: " + value + ";";
    }
}
