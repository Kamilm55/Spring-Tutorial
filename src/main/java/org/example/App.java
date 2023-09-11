package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // 1. ApplicationContext

//        Vehicle vehicle = new Car(); // in interface case we don't need to change 2 code (type,constructor)
        // but if we want to change we must change source code how to prevent it
        // in spring we can note in spring.xml and when change xml file we can change outcome without refactoring source code
        // spring.xml make decision for which class should be compatible with vehicle keyword

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        Vehicle vehicle = (Vehicle) applicationContext.getBean("vehicle");
//        vehicle.drive();

        // 2.

    }
}
