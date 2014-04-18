package ru.lpfu.npp.inheritance_homework_april1214;

/**
 * Created by Sabishinzou on 18.04.14.
 */
public class Lexus extends Automobile {

    public Lexus(String color, int id) {
        super(color, id);
    }

    @Override
    public String toString() {
        return super.toString() + " I'm Lex.";
    }

    @Override
    public void ride() {
        super.ride();
        System.out.println("Lex rides.");
    }
}
