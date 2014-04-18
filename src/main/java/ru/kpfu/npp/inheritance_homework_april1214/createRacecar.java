package ru.kpfu.npp.inheritance_homework_april1214;
import java.util.Random;

/**
 * Created by Sabishinzou on 18.04.14.
 */
public class createRacecar extends CarFactory {
    @Override
    public Car createCar(String carType) throws Exception{
        Random rand = new Random();
        if (carType.equals("Lamborgini")) {
            Lamborgini lambo_car = new Lamborgini("White", 1 + rand.nextInt(4), 250 + rand.nextInt(150));
            return lambo_car;
        }
        else
            if (carType.equals("Ferrari")) {
                Ferrari fer_car = new Ferrari("Black", 1 + rand.nextInt(4), 250 + rand.nextInt(150));
                return fer_car;
            }
            else
                throw new Exception("Invalid CarType.");
    }
}
