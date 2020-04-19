package com.design.creational.singleton;

public class DBSingletonDemo {
    public static void main(String[] args) {
        DBSingleton instance = DBSingleton.getInstance();

        System.out.println(instance);

        DBSingleton anotherInstance = DBSingleton.getInstance();

        System.out.println(anotherInstance);

    }
}
