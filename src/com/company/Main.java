package com.company;

public class Main {

    public static void main(String[] args) {


        Car ourcar = new Car("Audi", 200,100);
        System.out.println( ourcar.getPower());
        ourcar.setPower(110);
        ourcar.showpower1();
        System.out.println( ourcar.getPower());
        System.out.println( ourcar);
        Lorry newlorry= new Lorry("MAZ", 1500, 500, 1000);
        System.out.println( newlorry.getName());
        newlorry.setName("Kamaz");
        System.out.println( newlorry.getName());

        System.out.println( newlorry.getCarring());
        newlorry.setCarring(1500);
        System.out.println( newlorry.getCarring());
        System.out.println( newlorry);
    }
}