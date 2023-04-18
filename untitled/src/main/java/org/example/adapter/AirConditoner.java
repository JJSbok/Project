package org.example.adapter;

public class AirConditoner implements E220V{
    @Override
    public void connect() {
        System.out.println("에어컨 220V on");
    }
}
