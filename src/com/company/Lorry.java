package com.company;

public class Lorry extends Car{
    private int carring;
    public Lorry(String name, int waithg, int power, int carring){
        super(name, waithg,power);
        this.carring=carring;
    }

    public int getCarring() {
        return carring;
    }

    public void setCarring(int carring) {
        this.carring = carring;
    }

    @Override
    public String toString() {
        return super.toString()+"; carring:"+ carring;
    }
}
