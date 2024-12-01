package org.example.interview.test;

import java.util.HashMap;

public class HashMapTestAdvanced {
    public static void main(String[] args) {
        HashMap<Key, String> map = new HashMap<>();
        Key k1 = new Key(1);
        Key k2 = new Key(1);

        map.put(k1, "Value1");
        map.put(k2, "Value2");

        System.out.println("Map size: " + map.size()); //1
        System.out.println("Value for k1: " + map.get(k1)); //Value2
        System.out.println("Value for k2: " + map.get(k2)); //Value2
    }
}

class Key {
    private int id;

    public Key(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Key key = (Key) obj;
        return id == key.id;
    }
}
