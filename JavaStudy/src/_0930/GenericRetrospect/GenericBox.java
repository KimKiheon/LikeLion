package _0930.GenericRetrospect;

public class GenericBox<K,V> {
    private K key;
    private V value;

    public void set(K key, V value) {
        this.key=key;
        this.value=value;
    }

    @Override
    public String toString() {
        return "key:"+key+" value:"+value;
    }
}
