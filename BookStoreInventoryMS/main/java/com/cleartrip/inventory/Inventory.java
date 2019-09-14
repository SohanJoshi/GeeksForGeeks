package com.cleartrip.inventory;

import com.cleartrip.item.Item;

import java.util.Map;

public interface Inventory {

	int addItem(Item item, int count);

	int checkoutItem(Item item, int count);

	Map<Item, Integer> getAvailableItems();

}
