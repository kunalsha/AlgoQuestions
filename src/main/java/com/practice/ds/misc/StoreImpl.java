package com.practice.ds.misc;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

interface Store<K, V> {
	public void put(K k,  V v) throws Exception;
	public void get(K k);
	public void remove(K k);
	public int size();

}

public class StoreImpl<K, V> implements Store<K, V>{
	
		private Map<K, V> newMap = new HashMap<>();

		@Override
		public void put(K key, V value) throws Exception {
			if (key == null)
				throw new Exception("Null Value");
			newMap.put(key, value);
		}

		@Override
		public void get(K k) {
			newMap.get(k);
		}

		@Override
		public void remove(K k) {
			newMap.remove(k);
		}

		@Override
		public int size() {
			return newMap.size();
		}
		
		@Test
		public void put_ValidString() throws Exception {
			String key = "key";
			String value = "value";
			StoreImpl<String, String> sImpl = new StoreImpl<>();
			sImpl.put(key, value);
			Assert.assertEquals(1, sImpl.size());
		}
		
		
		@Test
		public void put_ValidInt() throws Exception {
			int key = 1;
			int value = 10;
			StoreImpl<Integer, Integer> sImpl = new StoreImpl<>();
			sImpl.put(key, value);
			Assert.assertEquals(1, sImpl.size());
		}
		
		
		@Test(expected = Exception.class)
		public void put_Invalid() throws Exception {
			String key = null;
			String value = null;
			StoreImpl<String, String> sImpl = new StoreImpl<>();
			sImpl.put(key, value);
		}
}