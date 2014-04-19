package ru.kpfu.npp.inheritance_homework_april1214;

import java.util.ArrayList;

/**
 * Created by Sabishinzou on 18.04.14.
 */
public class AutomobileSalon {

    public int array_size;

    //хотел сделать массивы более узких классов а не просто Car, но тогда при добавлении в него с помощью методов фабрик нужно приписывать (ClassName)
    //где ClassName - название более узкого класса (например Ferrari)
    //оставил так, хотя работало и по другому
    //а вообще, задание таково, что можно просто во всех спорных случаях писать класс Car(как возвращаемый) и все будет работать
    ArrayList<Ferrari> ferraris;
    ArrayList<Lamborgini> lamborginis;
    ArrayList<Belaz> belazs;
    ArrayList<Lexus> lexuses;

    public AutomobileSalon(int size) throws Exception {
        this.array_size = size;
        ferraris = new ArrayList<Ferrari>();
        lamborginis = new ArrayList<Lamborgini>();
        belazs = new ArrayList<Belaz>();
        lexuses = new ArrayList<Lexus>();
        for (int i = 0; i < array_size; i ++) {
            ferraris.add(i, (Ferrari) createRacecar.createCar("Ferrari"));
            lamborginis.add(i, (Lamborgini) createRacecar.createCar("Lamborgini"));
            belazs.add(i, (Belaz) createTruck.createCar("Belaz"));
            lexuses.add(i, (Lexus) createAutomobile.createCar("Lexus"));
        }
    }

    public ArrayList<Car> findCarsById(int id) {
        ArrayList<Car> list = new ArrayList<Car>();
        for (int i = 0; i < array_size; i ++) {
            if (ferraris.get(i).getId()==id)
                list.add(ferraris.get(i));
            if (lamborginis.get(i).getId() == id)
                list.add(lamborginis.get(i));
            if (belazs.get(i).getId() == id)
                list.add(belazs.get(i));
            if (lexuses.get(i).getId() == id)
                list.add(lexuses.get(i));
        }
        return list;
    }
    public void printCars(ArrayList<Car> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
