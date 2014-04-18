package ru.lpfu.npp.inheritance_homework_april1214;

/**
 * Created by Sabishinzou on 18.04.14.
 */
public abstract class Automobile extends Car{

    public Automobile(String color, int id){
        super(color,id);
    }

    @Override
    public String toString() {
        return super.toString() + " I'm Automobile";
    }
    @Override
    public void ride() {
        System.out.println(super.getId() + " Automobile rides.");
    }
}
