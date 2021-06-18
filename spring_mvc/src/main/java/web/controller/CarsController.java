package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/first")
public class CarsController {


    @GetMapping(value = "/cars")
    public String printCars(HttpServletRequest request, ModelMap modelMap) {

        CarService carService = new CarServiceImp();

        int countCar;

        String req = request.getParameter("count");

        if(req == null) {
            countCar = 5;
        } else {
            countCar = Integer.parseInt(req);
        }

        modelMap.addAttribute("tableCars", carService.getCars(countCar));
        return "cars";
    }
}
