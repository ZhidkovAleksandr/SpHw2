package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        Dog d = ctx.getBean("malinua", Dog.class);
        System.out.println(d);

        Car car = ctx.getBean("car", Car.class);
        System.out.println(car.getWhatModel().get("renault"));

    }
}