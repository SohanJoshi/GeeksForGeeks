package com.design.creational.singleton;

public class SingletonEverydayDemo {
    public static void main(String[] args) {
        Runtime runtimeInstance = Runtime.getRuntime();

        runtimeInstance.gc();

        Runtime anotherInstance = Runtime.getRuntime();

        System.out.println(runtimeInstance);
        System.out.println(anotherInstance);

        if(runtimeInstance == anotherInstance)
            System.out.println("The runtime instances are equal");
    }
}
