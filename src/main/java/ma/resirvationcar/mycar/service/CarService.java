package ma.resirvationcar.mycar.service;

import ma.resirvationcar.mycar.entity.Car;
import ma.resirvationcar.mycar.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;
    public Car add(Car car) {
        return carRepository.save(car);
    }


    public List<Car> afficher() {
    return carRepository.findAll();
    }


    public List<Car> search(String car) {
        return carRepository.findByMatricule(car);
    }
}
