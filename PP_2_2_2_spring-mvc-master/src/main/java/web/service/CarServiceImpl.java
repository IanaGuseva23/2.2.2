package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService{
    private final List<Car> car;

    {
        car = new ArrayList<>();

        car.add(new Car(2007, "BMW", "black"));
        car.add(new Car(2015, "Audi", "red"));
        car.add(new Car(2018, "Kia", "blue"));
        car.add(new Car(2005, "Mercedes", "white"));
        car.add(new Car(2020, "Volvo", "black"));
    }

    public List<Car> getCarList(Integer count) {
        if (count != null) {
            return car.stream().limit(count).toList();
        } else return car;
    }
}
