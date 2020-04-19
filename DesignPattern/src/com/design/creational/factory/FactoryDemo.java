package com.design.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(blog.getPages());

        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(shop.getPages());
    }
}
