package web.DAO;


import web.model.Car;

import java.util.List;

public interface CarDAO {
    public List<Car> getCarsList(int count);
}
