package org.example.adapter;

public class SocketAdapter implements E110V{
    private E220V e220V;

    public SocketAdapter(E220V e220V){
        this.e220V = e220V;
    }
    @Override
    public void powerOn() {
        e220V.connect();

    }
}
