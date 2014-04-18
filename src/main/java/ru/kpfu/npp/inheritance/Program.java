package ru.kpfu.npp.inheritance;

/**
 * Created by Sabishinzou on 12.04.14.
 */
public class Program {
    public static void main(String args[]) {
        Dog dog = new Dog("Bobik");
        dog.move();
        dog.voice();

        Cat cat = new Cat("Murzik");
        cat.move();
        cat.voice();

        Animal animal = new Dog("Rex");
        animal.move();
        animal.voice();

        Animal[] animals = new Animal[10];
        for (int i = 0; i < 10; i++) {
            if (i%2 == 0) {
                animals[i] = new Dog("Dog number " + i);
            }
            else {
                animals[i] = new Cat("Cat number " + i);
            }
        }
        for (Animal anim : animals) {
            anim.move();
        }
    }
}
