package ru.kpfu.npp.inheritance_homework_april1214;

/**
 * Created by Sabishinzou on 18.04.14.
 */
public abstract class Racecar extends Car{

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Racecar(String color, int id, int speed){
        super(color,id);
        this.setSpeed(speed);
    }

    @Override
    public String toString() {
        return super.toString() + " I'm Racecar";
    }

    @Override
    public void ride() {
        System.out.println(super.getId() + " Racecar rides.");
    }
}
