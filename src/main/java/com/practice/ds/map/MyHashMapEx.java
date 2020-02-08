package com.practice.ds.map;

public class MyHashMapEx {

	public static void main(String[] args) {
		
		MyHashMap<Integer, Integer> map = new MyHashMap<>();

		map.put(1, 3);
		map.put(2, 4);
		map.put(3, 6);

		System.out.println(map.get(3));
	}

}

class MyHashMap<K, V> {
	MyEntry<K, V>[] buckets;
	int len = 8;

	public MyHashMap() {
		buckets = new MyEntry[8];
	}

	public void put(K k, V v) {
		
		int size = k.hashCode();
		int bucket = size%len;
		
		System.out.println(bucket);
		MyEntry<K, V> current = new MyEntry<>(k, v, null);

		if(buckets[bucket] == null) {
			buckets[bucket] = current;
		} else {
			current = buckets[bucket];

			while(current.next!=null)
				current = current.next;
					
			MyEntry<K, V> entrySet = new MyEntry<>(k, v, null);
			
			current.next = entrySet;
		}

	}

	public V get(K k) {
		int size = k.hashCode();
		int bucket = size % len;

		MyEntry<?, ?> current = buckets[bucket];

		while (current != null) {
			if (current.getKey().equals(k)) {
				return (V) current.getValue();
			}
			current = current.next;
		}
		return null;
	}
}

class MyEntry<K, V> {
	private K key;
	private V value;
	public MyEntry<K, V> next;

	public MyEntry(K k, V v, MyEntry<K, V> my) {
		this.key = k;
		this.value = v;
		this.next = my;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public MyEntry<K, V> getNext() {
		return next;
	}
}