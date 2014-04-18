package ru.kpfu.npp.inheritance;

/**
 * Created by Sabishinzou on 12.04.14.
 */
public abstract class Animal {

    private String animalName;

    /**
     * Simple constructor
     * @param name name of this
     */
    public Animal(String name) {
        this.animalName = name;
    }

    /**
     * Cal when we want to move animal
     */
    public void move() {
        System.out.println(
                this.animalName + " is moving"
        );
    }

    /**
     * Call when we want to listen animal
     */
    public abstract void voice();


}
