package com.xg.Xinfu_Guo_ITE5435_FinalExam.controller;

import com.xg.Xinfu_Guo_ITE5435_FinalExam.model.Payment;
import com.xg.Xinfu_Guo_ITE5435_FinalExam.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping
    public ResponseEntity<Payment> create(@RequestBody Payment payment) {
        return ResponseEntity.ok(service.create(payment));
    }

    @GetMapping
    public List<Payment> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Payment getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Payment update(@PathVariable String id, @RequestBody Payment payment) {
        return service.update(id, payment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
