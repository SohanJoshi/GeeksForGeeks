package com.design.creational.builder;

public class LunchOrderDemo {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Brown Bread")
                .condiments("Lettuce")
                .dressing("Mayo")
                .build();

        LunchOrder order = builder.build();

        System.out.println(order);

    }
}
