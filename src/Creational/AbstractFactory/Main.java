package Creational.AbstractFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Factory> factoryList = new ArrayList<>();
        factoryList.add(addCar("Volkswagen"));
        factoryList.add(addCar("Skoda"));
        factoryList.add(addCar("Volkswagen"));


        List<Car> carList = factoryList.stream().map(Factory::createNewCar).collect(Collectors.toList());

        for (Car car : carList) {
            car.manufacture();
        }

        List<Factory> truckFactoryList = new ArrayList<>();
        truckFactoryList.add(addTruck("Skoda"));
        truckFactoryList.add(addTruck("Skoda"));
        truckFactoryList.add(addTruck("Volkswagen"));

        List<Truck> truckList = truckFactoryList.stream().map(Factory::createNewTruck).collect(Collectors.toList());

        for (Truck truck : truckList) {
            truck.manufacture();
        }
    }

    private static Factory addCar(String brand) {
        if (brand.equals("Skoda")) {
            return new SkodaFactory();
        } else if (brand.equals("Volkswagen")) {
            return new VolkswagenFactory();
        } else {
            throw new RuntimeException(brand + " is unknown brand");
        }
    }

    private static Factory addTruck(String brand) {
        if (brand.equals("Skoda")) {
            return new SkodaFactory();
        } else if (brand.equals("Volkswagen")) {
            return new VolkswagenFactory();
        } else {
            throw new RuntimeException(brand + " is unknown brand");
        }
    }
}
