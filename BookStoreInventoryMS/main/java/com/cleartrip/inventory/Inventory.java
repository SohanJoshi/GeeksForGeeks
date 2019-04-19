package com.cleartrip.inventory;

import java.util.Map;

import com.cleartrip.item.Item;

public interface Inventory {

	int addItem(Item item, int count);

	int checkoutItem(Item item, int count);

	Map<Item, Integer> getAvailableItems();

}
