package ru.kpfu.npp.inheritance_homework_april1214;
import java.util.Scanner;

/**
 * Created by Sabishinzou on 19.04.14.
 */
public class TestCars {
    public static void main(String[] args) throws Exception {
        AutomobileSalon salon = new AutomobileSalon(10);
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        salon.printCars(salon.findCarsById(id));
    }
}
