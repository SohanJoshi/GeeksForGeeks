package com.cleartrip.inventory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.cleartrip.item.Item;

public class BookStoreInventory implements Inventory {

	private final Map<Item, Integer> availableItems = new ConcurrentHashMap<>();
	private final Map<Item, Integer> checkedoutItems = new ConcurrentHashMap<>();

	@Override
	public int addItem(Item item, int count) {
		Integer currentCount = 0;
		synchronized (this) {
			availableItems.put(item, availableItems.getOrDefault(item, 0) + count);
			currentCount = availableItems.get(item);
		}
		return currentCount == null ? 0:currentCount;
	}

	@Override
	public int checkoutItem(Item item, int count) {
		Integer currentCount ;
		synchronized (this) {
			currentCount = availableItems.get(item);
			if(currentCount == null || currentCount < count)
				return -1;
			checkedoutItems.put(item, checkedoutItems.getOrDefault(item, 0) + count);
			currentCount = availableItems.put(item, availableItems.get(item) - count);
		}
		return currentCount;
	}

	protected Map<Item, Integer> getAvailableItems() {
		return availableItems;
	}

	protected Map<Item, Integer> getCheckedoutItems() {
		return checkedoutItems;
	}

}
