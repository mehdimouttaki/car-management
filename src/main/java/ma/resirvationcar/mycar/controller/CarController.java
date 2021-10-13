package ma.resirvationcar.mycar.controller;

import ma.resirvationcar.mycar.entity.Car;
import ma.resirvationcar.mycar.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CarController {
    @Autowired
    private CarService carService;
    @PostMapping(path = "cars")
    public ResponseEntity<Car> add(@RequestBody Car car) {
        carService.add(car);
        if (car == null) {
            throw new RuntimeException();
        } else {
            return new ResponseEntity<>(car, HttpStatus.CREATED);
        }
    }

    @GetMapping(path = "cars")
    public List<Car> findAll(){
        return carService.afficher();
    }

    @GetMapping(path = "cars/{car}")
    public List<Car> search(@PathVariable String car){
        return carService.search(car);
    }


}
