package org.example;

public class ItemImpl implements Item{
    private String name = "Kamil";

    @Override
    public void feauture1() {
        System.out.println("name is: " + name);
    }

}
