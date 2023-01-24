package project.projectspring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import project.projectspring.model.Reservation;
import project.projectspring.model.request.ReservationCreationRequest;
import project.projectspring.repository.ReservationRepository;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public Reservation createReservation(ReservationCreationRequest request) {
        Reservation reservation = new Reservation();
        BeanUtils.copyProperties(request, reservation);

        //return reservationRepository.insert(reservation);
        return reservation;
    }
}
