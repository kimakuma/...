package project.projectspring.model.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReservationCreationRequest {
    private String name;
    private String phone;
    private String hostpital;
    private String pain;
    private LocalDateTime data;
}
