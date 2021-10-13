package ma.resirvationcar.mycar.repository;

import ma.resirvationcar.mycar.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {

    List<Car> findByMatricule(String car);
}
