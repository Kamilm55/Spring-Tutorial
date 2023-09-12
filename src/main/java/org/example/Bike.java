package org.example;

import org.springframework.stereotype.Component;

//@Component
public class Bike {
    private String model;

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
