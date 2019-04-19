package com.cleartrip.inventory;

import com.cleartrip.item.Item;

public interface InventoryManager {

	void createInventory();

	int updateItems(Item item, int count);

	void checkOut(Item item, int count);

	void generateReport();

}
