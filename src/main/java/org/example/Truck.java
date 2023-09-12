package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Truck implements Vehicle{
    @Override
    public void drive() {

    }
}
