package ru.kpfu.npp.inheritance_homework_april1214;

/**
 * Created by Sabishinzou on 18.04.14.
 */
public abstract class Truck extends Car {

    public Truck(String color, int id){
        super(color, id);
    }

    @Override
    public String toString() {
        return super.toString() + " I'm Truck";
    }
    @Override
    public void ride() {
        System.out.println(super.getId() + " Truck rides.");
    }
}
