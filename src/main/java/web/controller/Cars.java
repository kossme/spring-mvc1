package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Cars {

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false) int count, Model model) {
        List<Car> resultList;
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

        resultList = carsList.subList(0, count);

        model.addAttribute("cars", resultList);
        System.out.println(resultList);
        return "carsList";
    }

}