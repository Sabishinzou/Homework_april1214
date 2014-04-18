package ru.kpfu.npp.inheritance_homework_april1214;

/**
 * Created by Sabishinzou on 18.04.14.
 */
public abstract class Car implements Rideable{

    private String color;
    private int id;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car(String color, int id){
        this.setColor(color);
        this.setId(id);
    }

    @Override
    public String toString() {
        return "I'm car. My color - " + getColor() + " My id - " + getId();
    }

}
