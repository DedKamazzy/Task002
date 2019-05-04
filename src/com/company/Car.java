package com.company;

public class Car { //класс машин с обычной мощностью
    private String name; // марка
    private int waithg; // вес
    private int power;  // мощность

    public Car(String name, int waithg, int power) {
        this.name = name;
        this.power = power;
        this.waithg = waithg;

    }

    public void showpower1() {// метод определяющий сумму налога для машин
        if (power >= 100) {
            System.out.println(power);
        } else {
            System.out.println("Обычный налог");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWaithg() {
        return waithg;
    }

    public void setWaithg(int waithg) {
        this.waithg = waithg;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "name:"+name+"; waithg:"+waithg+"; power: "+power;
    }
}





