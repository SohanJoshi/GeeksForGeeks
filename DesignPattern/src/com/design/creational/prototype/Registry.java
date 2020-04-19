package com.design.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String itemType) {
        Item item = null;
        try {
            item = items.get(itemType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }

        return  item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(150.00);
        movie.setRuntime("2 hours");

        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("A Good Book");
        book.setPrice(23.5);
        book.setNumberOfPages(456);

        items.put("Book", book);
    }
}
