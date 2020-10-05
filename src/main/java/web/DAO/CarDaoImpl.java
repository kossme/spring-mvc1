package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDAO {

    @Override
    public List<Car> getCarsList(int count) {

        List<Car> carsList = new ArrayList<>();
        Car car1 = new Car(1, "Vaz", "DOHC");
        Car car2 = new Car(2, "Nissan", "V6");
        Car car3 = new Car(3, "Opel", "V8");
        Car car4 = new Car(4, "BMW", "HMI98");
        Car car5 = new Car(5, "Audi", "A979");
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);

        if ((count < 0) || (count > 5)) {
            count = 5;
        }

        return carsList.subList(0, count);
    }
}
