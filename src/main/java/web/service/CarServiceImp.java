package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    private List<Car> cars;

    public CarServiceImp() {
        cars = new ArrayList<>();
        cars.add(new Car("Chevrolet", "USA", 2005));
        cars.add(new Car("Land Rover", "United Kingdom", 2016));
        cars.add(new Car("Volvo", "Kingdom of Sweden", 2011));
        cars.add(new Car("Tesla", "USA", 2022));
        cars.add(new Car("Ford", "USA", 2001));
    }

    @Override
    public List<Car> getCars(int quantity) {
        if (quantity < 1 || quantity >= 5) {
            return cars;
        } else {
            return cars.stream().limit(quantity).collect(Collectors.toList());
        }
    }
}
