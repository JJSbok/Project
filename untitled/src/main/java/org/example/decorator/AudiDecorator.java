package org.example.decorator;

public class AudiDecorator implements ICar{

    protected Audi audi;
    protected String modelName;

    protected int modelPrice;

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void showPrice() {

    }
}
