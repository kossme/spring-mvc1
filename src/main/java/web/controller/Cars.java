package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Cars {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false) int count, Model model) {
        List<Car> resultList = new ArrayList<>();
        resultList = carService.getCarsList(count);
        model.addAttribute("cars", resultList);
        return "carsList";
    }

}