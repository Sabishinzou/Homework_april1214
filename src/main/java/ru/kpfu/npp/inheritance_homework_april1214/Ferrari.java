package ru.kpfu.npp.inheritance_homework_april1214;

/**
 * Created by Sabishinzou on 18.04.14.
 */
public class Ferrari extends Racecar {

    public Ferrari(String color, int id, int speed) {
        super(color, id, speed);
    }

    @Override
    public String toString() {
        return super.toString() + " I'm Ferrari.";
    }

    @Override
    public void ride() {
        super.ride();
        System.out.println("Ferrari rides.");
    }
}
