package Creational.FactoryMethod;

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

        for (Car car1 : carList) {
            car1.manufacture();
        }
    }
    private static Factory addCar (String brand){
        if(brand.equals("Skoda")){
            return new SkodaFactory();
        }
        else if (brand.equals("Volkswagen")){
            return new VolkswagenFactory();
        }else {
            throw  new RuntimeException(brand + " is unknown brand");
        }
    }
}
