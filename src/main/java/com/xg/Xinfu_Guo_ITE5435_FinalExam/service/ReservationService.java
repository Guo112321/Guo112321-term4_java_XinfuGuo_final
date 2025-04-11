package com.xg.Xinfu_Guo_ITE5435_FinalExam.service;

import com.xg.Xinfu_Guo_ITE5435_FinalExam.model.Reservation;
import com.xg.Xinfu_Guo_ITE5435_FinalExam.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository repository;

    public Reservation create(Reservation reservation) {
        return repository.save(reservation);
    }

    public List<Reservation> findAll() {
        return repository.findAll();
    }

    public Reservation findById(String id) {
        return repository.findById(id).orElse(null);
    }

    public Reservation update(String id, Reservation reservation) {
        reservation.setId(id);
        return repository.save(reservation);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
