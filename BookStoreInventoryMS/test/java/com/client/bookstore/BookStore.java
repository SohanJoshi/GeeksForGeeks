package com.client.bookstore;

import com.cleartrip.inventory.BookStoreInventoryManager;
import com.cleartrip.item.Item;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BookStore {

	private BookStoreInventoryManager manager;
	private Item item1;
	private Item item2;
	private Item item3;
	private Item item4;
	
	public void setUp() {
		item1 = new Item(123, "Pens", 4.50);
		item2 = new Item(456, "Pencil", 3.50);
		item3 = new Item(432, "NoteBook", 10);
		item4 = new Item(654, "Fountain Pen", 10);
		manager = new BookStoreInventoryManager();
	}
	
	@Test
	public void createInventory() {
		setUp();
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		for(int i = 0 ; i < 10; i++)
			service.submit(() -> manager.createInventory());
		
		service.shutdownNow();
		manager.createInventory();
	}
	
	@Test
	public void addItems() {
		setUp();
		manager.updateItems(item1, 5);
		manager.updateItems(item2, 10);
		manager.updateItems(item3, 20);
	}
	
	@Test
	public void checkoutItem() {
		setUp();
		addItems();
		manager.checkOut(item1, 8);
		manager.checkOut(item2, 3);
		manager.checkOut(item4, 3);
	}
	
	@Test
	public void generateReport() {
		setUp();
		addItems();
		manager.generateReport();
	}
}
