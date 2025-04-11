package com.xg.Xinfu_Guo_ITE5435_FinalExam.service;

import com.xg.Xinfu_Guo_ITE5435_FinalExam.model.Payment;
import com.xg.Xinfu_Guo_ITE5435_FinalExam.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public Payment create(Payment payment) {
        return repository.save(payment);
    }

    public List<Payment> findAll() {
        return repository.findAll();
    }

    public Payment findById(String id) {
        return repository.findById(id).orElse(null);
    }

    public Payment update(String id, Payment payment) {
        payment.setId(id);
        return repository.save(payment);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
