package ru.lpfu.npp.inheritance_homework_april1214;

/**
 * Created by Sabishinzou on 18.04.14.
 */
public class Lamborgini extends Racecar {

    public Lamborgini(String color, int id, int speed) {
        super(color, id, speed);
    }

    @Override
    public String toString() {
        return super.toString() + " I'm Lambo.";
    }

    @Override
    public void ride() {
        super.ride();
        System.out.println("Lambo rides.");
    }
}
