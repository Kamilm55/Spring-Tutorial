package org.example;

public class ItemImpl2 implements Item {
    private int num = 0;

    @Override
    public void feauture1() {
        System.out.println("Your num is: " + num);
    }

}
