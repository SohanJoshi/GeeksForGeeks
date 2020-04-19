package com.design.creational.builder;

public class BuilderEverydayDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("This is a String Builder instance. ");
        builder.append("This instance helps append value to the builder to help construct actual instance. \n");
        builder.append("Values like ");
        builder.append(100);
        builder.append(" or ");
        builder.append(10.65);
        builder.append(" can be appended in the builder instance.");

        System.out.println(builder.toString());
    }

}
