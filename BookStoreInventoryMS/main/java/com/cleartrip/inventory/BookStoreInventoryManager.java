package com.cleartrip.inventory;

import com.cleartrip.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.Map.Entry;

public class BookStoreInventoryManager implements InventoryManager {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BookStoreInventoryManager.class);

	private Inventory inventory;

	@Override
	public void createInventory() {
		if(inventory == null)
			synchronized (this) {
				if (inventory == null) {
					inventory = new BookStoreInventory();
					LOGGER.info("New Inventory Created");
				}
			}
	}
	
	@Override
	public int updateItems(Item item, int count) {
		if(inventory == null)
			createInventory();
		int updatedCount = inventory.addItem(item, count);
		LOGGER.info("Updated the count for the Item : {} to {} ", new Object[] {item, updatedCount});
		return updatedCount;
	}

	@Override
	public void checkOut(Item item, int count) {
		if(inventory == null)
		{
			LOGGER.info("No inventory has been created till now. Please create and add some items to checkout them");
			return;
		}
		
		int updatedCount = inventory.checkoutItem(item, count);
		if(updatedCount < 0)
			LOGGER.info("There is not enough of stocks to checkout the desired numbers of given item");
		else
			LOGGER.info("The {} numbers of {} have been checkedout and still {} are still available in Stock",
					new Object[] {count, item, updatedCount});
		
	}
	
	@Override
	public void generateReport() {
		Map<Item, Integer> availableItems = inventory.getAvailableItems();
		int countOfItems = 1;
		LOGGER.info("----------------INVENTORY REPORT---------------");
		LOGGER.info("Sl.\tItem Code\tItem Name\t\tItem Price\t\tItem Count");
		for (Entry<Item, Integer> entry : availableItems.entrySet())
		{
			LOGGER.info("{}. \t{}\t\t{}\t\t\t{}\t\t\t{}", 
					new Object[] {
							countOfItems++,
							entry.getKey().getId(),
							entry.getKey().getName(),
							entry.getKey().getCost(),
							entry.getValue()
					});
			
		}
		LOGGER.info("----------------REPORT CLOSED-----------------");
	}
	
}
