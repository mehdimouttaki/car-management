package ma.resirvationcar.mycar.controller;

import ma.resirvationcar.mycar.entity.Car;
import ma.resirvationcar.mycar.entity.Reservation;
import ma.resirvationcar.mycar.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    @PostMapping(path = "reservations")
    public ResponseEntity<Reservation> add(@RequestBody Reservation reservation) {
        reservationService.add(reservation);
        if (reservation == null) {
            throw new RuntimeException();
        } else {
            return new ResponseEntity<>(reservation, HttpStatus.CREATED);
        }
    }


    @GetMapping(path = "reservations")
    public List<Reservation> findAll(){
        return reservationService.findall();
    }



}
