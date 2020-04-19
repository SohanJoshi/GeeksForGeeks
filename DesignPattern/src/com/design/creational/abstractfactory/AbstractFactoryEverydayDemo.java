package com.design.creational.abstractfactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class AbstractFactoryEverydayDemo {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        String xml = "<document><body><stock>AAPL</stock></body></document>";
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = abstractFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(bais);

        document.getDocumentElement().normalize();

        System.out.println("Root Element : " + document.getDocumentElement().getNodeName());

        System.out.println(abstractFactory.getClass());
        System.out.println(documentBuilder.getClass());
    }
}
