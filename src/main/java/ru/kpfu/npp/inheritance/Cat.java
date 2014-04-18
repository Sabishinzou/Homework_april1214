package ru.kpfu.npp.inheritance;

/**
 * Created by Sabishinzou on 12.04.14.
 */
public class Cat extends Animal {
    @Override
    public void voice() {
        System.out.println("Meow Meow");
    }

    public Cat(String name) {
        super(name);
    }
}
