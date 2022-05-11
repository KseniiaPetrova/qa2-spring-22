package hw;

import org.junit.jupiter.api.Test;

public class HomeWork {

    @Test
    public void usingObjects() {
        Car car1 = new Car("Volkswagen", 20, 10);
        Car car2 = new Car("Audi", 25, 13);
        Car car3 = new Car("BMW", 30, 15);

        Train train1 = new Train("TGV", 100, 200);
        Train train2 = new Train("Eurostar", 170, 350);

        double distance = 56;
        double fuelPrice = 1.8;

        double fuelConsumptionCar1 = getFuelConsumptionForDistance(car1.getFuelConsumption(), distance);
        double fuelConsumptionCar2 = getFuelConsumptionForDistance(car2.getFuelConsumption(), distance);
        double fuelConsumptionCar3 = getFuelConsumptionForDistance(car3.getFuelConsumption(), distance);

        System.out.println("Fuel consumption");
        System.out.println(car1.getModelName() + ": " + fuelConsumptionCar1);
        System.out.println(car2.getModelName() + ": " + fuelConsumptionCar2);
        System.out.println(car3.getModelName() + ": " + fuelConsumptionCar3);

        double fuelConsumptionTrain1 = getFuelConsumptionForDistance(train1.getFuelConsumption(), distance);
        double fuelConsumptionTrain2 = getFuelConsumptionForDistance(train2.getFuelConsumption(), distance);

        System.out.println(train1.getModelName() + ": " + fuelConsumptionTrain1);
        System.out.println(train2.getModelName() + ": " + fuelConsumptionTrain2);

        System.out.println("");

        double costCar1 = getCostForTonn(fuelPrice, car1.getLoadCapacity(), fuelConsumptionCar1);
        double costCar2 = getCostForTonn(fuelPrice, car2.getLoadCapacity(), fuelConsumptionCar2);
        double costCar3 = getCostForTonn(fuelPrice, car3.getLoadCapacity(), fuelConsumptionCar3);

        System.out.println("Load capacity");
        System.out.println(car1.getModelName() + ": " + costCar1);
        System.out.println(car2.getModelName() + ": " + costCar2);
        System.out.println(car3.getModelName() + ": " + costCar3);

        double costTrain1 = getCostForTonn(fuelPrice, train1.getLoadCapacity(), fuelConsumptionTrain1);
        double costTrain2 = getCostForTonn(fuelPrice, train1.getLoadCapacity(), fuelConsumptionTrain2);

        System.out.println(train1.getModelName() + ": " + costTrain1);
        System.out.println(train2.getModelName() + ": " + costTrain2);

        System.out.println("");

        System.out.println(findCheapest(car1, train1, distance, fuelPrice));
        System.out.println(findCheapest(car1, train2, distance, fuelPrice));
        System.out.println(findCheapest(car2, train1, distance, fuelPrice));
        System.out.println(findCheapest(car2, train2, distance, fuelPrice));
        System.out.println(findCheapest(car3, train1, distance, fuelPrice));
        System.out.println(findCheapest(car3, train2, distance, fuelPrice));
    }

    public double getFuelConsumptionForDistance(double fuelConsumption, double distance) {
        return fuelConsumption * distance / 100;
    }

    public double getCostForTonn(
            double fuelPrice,
            double loadCapacity,
            double fuelConsumptionForDistance
    ) {
        return fuelPrice * fuelConsumptionForDistance / loadCapacity;
    }

    public String findCheapest(
            Car car,
            Train train,
            double distance,
            double fuelPrice
    ) {
        double fuelConsumptionCar = getFuelConsumptionForDistance(car.getFuelConsumption(), distance);
        double fuelConsumptionTrain =  getFuelConsumptionForDistance(train.getFuelConsumption(), distance);

        double costCar = getCostForTonn(fuelPrice, car.getLoadCapacity(), fuelConsumptionCar);
        double costTrain = getCostForTonn(fuelPrice, train.getLoadCapacity(), fuelConsumptionTrain);

        if (costCar <= costTrain) {
            return car.getModelName() + " car is cheaper than " + train.getModelName() + " train";
        } else {
            return train.getModelName() + " train is cheaper than " + car.getModelName() + " car";
        }
    }
}
