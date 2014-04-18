package ru.kpfu.npp.inheritance_homework_april1214;

/**
 * Created by Sabishinzou on 18.04.14.
 */
public class Belaz extends Truck {
    public Belaz(String color, int id) {
        super(color, id);
    }

    @Override
    public String toString() {
        return super.toString() + " I'm Belaz.";
    }

    @Override
    public void ride() {
        super.ride();
        System.out.println("Belaz rides.");
    }
}
