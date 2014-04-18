package ru.kpfu.npp.inheritance_homework_april1214;

import java.util.Random;

/**
 * Created by Sabishinzou on 18.04.14.
 */
public class createTruck extends CarFactory{

    @Override
    public Car createCar(String carType) throws Exception {
        Random rand = new Random();
        if (carType.equals("Belaz")){
            Belaz bel_car = new Belaz("Red", 1 + rand.nextInt(4));
            return bel_car;
        }
        else
            throw  new Exception("Invalid CarType.");
    }
}
