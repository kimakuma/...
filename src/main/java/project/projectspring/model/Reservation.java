package project.projectspring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    // TODO] change 2 Many to One
    private String name;
    private String phone;

    private String hostpital;
    private String pain;

    // TODO] private LocalDateTime data;
    // TODO] add img
}
