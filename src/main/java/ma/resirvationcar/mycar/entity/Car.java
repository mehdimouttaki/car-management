package ma.resirvationcar.mycar.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true, nullable = false)
    private String matricule;
    @Column(nullable = true)
    private Double priceDay;
    @Column(nullable = true)
    private String image;



}
