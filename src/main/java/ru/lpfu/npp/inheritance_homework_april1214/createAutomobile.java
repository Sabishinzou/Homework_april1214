package ru.lpfu.npp.inheritance_homework_april1214;

import java.util.Random;

/**
 * Created by Sabishinzou on 18.04.14.
 */
public class createAutomobile extends CarFactory {
    @Override
    public Car createCar(String carType) throws Exception {
        Random rand = new Random();
        if (carType.equals("Lexus")){
            Lexus auto_car = new Lexus("Blue", 1 + rand.nextInt(4));
            return auto_car;
        }
        else
            throw  new Exception("Invalid CarType.");
    }
}
