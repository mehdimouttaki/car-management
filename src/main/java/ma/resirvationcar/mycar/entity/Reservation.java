package ma.resirvationcar.mycar.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.util.Date;

@Getter
@Setter
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Date dateStart;
    @Column(nullable = true)
    private Date dateEnd;
    @Column(nullable = true)
    private String paymentMethode;


}
