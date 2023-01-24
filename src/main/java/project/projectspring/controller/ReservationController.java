package project.projectspring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.projectspring.model.Reservation;
import project.projectspring.model.request.ReservationCreationRequest;
import project.projectspring.service.ReservationService;

@RestController
@RequestMapping(value = "/api/reservation")
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;

    @PostMapping("/reservation")
    public ResponseEntity<Reservation> createReservation (@RequestBody ReservationCreationRequest request) {
        return ResponseEntity.ok(reservationService.createReservation(request));
    }
}
