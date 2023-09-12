package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle {
    @Autowired
    @Qualifier("car")
    private Vehicle vehicle;
    public void drive(){
        System.out.println("BUS DRIVES");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "bike=" + vehicle +
                '}' ;
    }
}
