package Week03.Friday.HashMap;


import java.util.*;

/**
 * Created by inspired on 27.12.15.
 */
public class HashMap<K, V> implements Map<K, V> {
    private int capacity;
    private List<List<MapEntry<K, V>>> buckets;
    private final float DEFAULT_LOAD_FACTOR = 0.75f;
    private int totalEntries = 0;
    private int threshold;

    public HashMap() {
        capacity = 16; // initial capacity
        buckets = new ArrayList<>(capacity);
        threshold = (int) (capacity * DEFAULT_LOAD_FACTOR);
        init(0);
    }

    private void init(int oldCapacity) {
        for (int i = oldCapacity; i < capacity; i++) {
            buckets.add(new LinkedList<MapEntry<K, V>>());
        }
    }

    private int hash(Object key) {
        return Math.abs(key.hashCode() % capacity);
    }

    @Override
    public int size() {
        return totalEntries;
    }

    @Override
    public boolean isEmpty() {
        return totalEntries == 0;
    }

    @Override
    public boolean containsValue(Object value) {
        Iterator it = buckets.iterator();
        V entryValue;
        while(it.hasNext()){
            List<MapEntry<K, V>> bucket = (List<MapEntry<K, V>>) it.next();
            for(MapEntry<K, V> entry: bucket){
                entryValue = entry.getValue();
                if(entryValue == value || (value != null && value.equals(entryValue))) {
                    return true;
                }
            }
        }
        return false;
    }

    public V put(K key, V value) {
        if (key == null || containsKey(key)) {
            System.err.println("Please enter a valid key, which is unique. '" + key + "' won't be added.");
            if(key != null){
                System.err.println("'" + key + "' is already added.");
            }
            return value;
        }

        int position = hash(key);
        List<MapEntry <K, V>> bucket = buckets.get(position);

        if (bucket == null) {
            return value;
        }

        for (MapEntry<K, V> entry : bucket) {
            if (key.equals(entry.getKey())) {
                entry.setValue(value);
                return value;
            }
        }

        if (totalEntries == threshold) {
            resize();
        }
        bucket.add(new MapEntry(key, value));
        totalEntries++;
        return value;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for(Map.Entry<? extends K, ? extends V> entry: m.entrySet()){
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        totalEntries = 0;
        capacity = 16; // initial capacity
        buckets.clear();
        init(0);
    }

    @Override
    public Set<K> keySet() {
        Set<K> keySet = new HashSet<K>();
        Iterator it = buckets.iterator();
        while(it.hasNext()){
            List<MapEntry<K, V>> bucket = (List<MapEntry<K, V>>) it.next();
            for(MapEntry<K, V> entry: bucket){
                keySet.add(entry.getKey());
            }
        }
        return keySet;
    }

    @Override
    public Collection<V> values() {
        Collection<V> keySet = new HashSet<V>();
        Iterator it = buckets.iterator();
        while(it.hasNext()){
            List<MapEntry<K, V>> bucket = (List<MapEntry<K, V>>) it.next();
            for(MapEntry<K, V> entry: bucket){
                keySet.add(entry.getValue());
            }
        }
        return keySet;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> keySet = new HashSet<Map.Entry<K, V>>();
        Iterator it = buckets.iterator();
        while(it.hasNext()){
            List<Map.Entry<K, V>> bucket = (List<Map.Entry<K, V>>) it.next();
            for(Map.Entry<K, V> entry: bucket){
                keySet.add(entry);
            }
        }
        return keySet;
    }

    @Override
    public boolean containsKey(Object key) {
        if (key == null) {
            return false;
        }

        V value = get(key);
        if (value != null) {
            return true;
        }
        return false;
    }

    @Override
    public V get(Object key) {
        if (key == null) {
            return null;
        }

        int position = hash(key);
        List<MapEntry <K, V>> bucket = buckets.get(position);
        if (bucket == null) {
            return null;
        }

        for (MapEntry<K, V> entry : bucket) {
            if (key.equals(entry.getKey())) {
                return entry.getValue();
            }
        }

        return null;
    }

    /*
     * We don't need to create a copy of the buckets list
     * because we use ArrayList and don't override its method ensureCapacity().
     * If we were using an array instead, we had to make a copy of this array with new capacity.
     */
    private void resize() {
        if (totalEntries == threshold) {
            int oldCapacity = capacity;
            capacity *= 2; // Doubling the capacity
            init(oldCapacity);
            //System.out.println("old: " + oldCapacity);
            //System.out.println("Doubling: " + capacity);
            //System.out.println("Size: " + buckets);
        }
        threshold = (int) (capacity * DEFAULT_LOAD_FACTOR);
    }

}
