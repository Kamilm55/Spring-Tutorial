package org.example;

import org.springframework.stereotype.Component;

@Component
public class Bike {
    private String model;

    public Bike() {
    }

    public Bike(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return " ... Bike .... ";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
