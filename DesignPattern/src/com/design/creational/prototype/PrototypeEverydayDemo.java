package com.design.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEverydayDemo {
    public static void main(String[] args) {
        String sql = "SELECT * FROM EMPLOYEES;";
        List<String> parameters = new ArrayList<>();
        parameters.add("SOHAN");
        Record record = new Record();

        Statement statement = new Statement(sql, parameters, record);
        System.out.println(statement.getSql());
        System.out.println(statement.getParameters());
        System.out.println(statement.getRecord());

        Statement anotherStatement = statement.clone();
        System.out.println(anotherStatement.getSql());
        System.out.println(anotherStatement.getParameters());
        System.out.println(anotherStatement.getRecord());
    }
}