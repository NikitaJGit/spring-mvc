package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {
    public List<Car> getCars(int count) {
        List <Car> cars = new ArrayList<>();
        cars.add(new Car("model1", 1, 2001));
        cars.add(new Car("model2", 2, 2002));
        cars.add(new Car("model3", 3, 2003));
        cars.add(new Car("model4", 4, 2004));
        cars.add(new Car("model5", 5, 2005));
        if(count>4) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
