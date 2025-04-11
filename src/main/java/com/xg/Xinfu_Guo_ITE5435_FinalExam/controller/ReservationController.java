package com.xg.Xinfu_Guo_ITE5435_FinalExam.controller;

import com.xg.Xinfu_Guo_ITE5435_FinalExam.model.Reservation;
import com.xg.Xinfu_Guo_ITE5435_FinalExam.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    @Autowired
    private ReservationService service;

    @PostMapping
    public ResponseEntity<Reservation> create(@RequestBody Reservation reservation) {
        return ResponseEntity.ok(service.create(reservation));
    }

    @GetMapping
    public List<Reservation> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Reservation getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Reservation update(@PathVariable String id, @RequestBody Reservation reservation) {
        return service.update(id, reservation);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
