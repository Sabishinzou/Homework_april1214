package ru.kpfu.npp.inheritance;

/**
 * Created by Sabishinzou on 12.04.14.
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void voice() {
        System.out.println("Wow Wow!");
    }
}
