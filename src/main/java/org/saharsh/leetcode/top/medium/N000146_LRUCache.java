package org.saharsh.leetcode.top.medium;

import java.util.HashMap;
import java.util.Map;

public class N000146_LRUCache {

	private static class Entry {

		private final int key;
		private int value;
		private Entry prev;
		private Entry next;

		private Entry(int key, int value) {
			this.key = key;
			this.value = value;
			this.prev = this;
			this.next = this;
		}

	}

	private final int capacity;
	private final Map<Integer, Entry> entriesMap = new HashMap<>();
	private Entry head = null;
	private int size = 0;

	public N000146_LRUCache(int capacity) {
		this.capacity = capacity;
	}

	public int get(int key) {
		final Entry entry = entriesMap.get(key);
		if (entry == null) {
			return -1;
		}
		if (entry != head) {
			unlist(entry);
			makeMRU(entry);
		}
		return entry.value;
	}

	public void put(int key, int value) {
		Entry entry = entriesMap.get(key);
		if (entry != null) {
			entry.value = value;
			unlist(entry);
		} else {
			entry = new Entry(key, value);
			if (size == capacity) {
				deleteLRU();
			}
			entriesMap.put(key, entry);
			size++;
		}
		makeMRU(entry);
	}

	private void unlist(Entry entry) {
		entry.prev.next = entry.next;
		entry.next.prev = entry.prev;
		if (entry == head) {
			head = entry.next == entry ? null : entry.next;
		}
		entry.prev = entry;
		entry.next = entry;
	}

	private void deleteLRU() {
		final Entry lru = head.prev;
		entriesMap.remove(lru.key);
		unlist(lru);
		size--;
	}

	private void makeMRU(Entry entry) {
		if (head != null) {
			entry.prev = head.prev;
			entry.next = head;
			entry.prev.next = entry;
			head.prev = entry;
		}
		head = entry;
	}

}
