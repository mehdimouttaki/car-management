package ma.resirvationcar.mycar.service;

import ma.resirvationcar.mycar.entity.Reservation;
import ma.resirvationcar.mycar.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;
    public Reservation add(Reservation reservation) {
        return reservationRepository.save(reservation);

    }


    public List<Reservation> findall() {
        return reservationRepository.findAll();
    }
}
