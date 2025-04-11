package com.xg.Xinfu_Guo_ITE5435_FinalExam.repository;

import com.xg.Xinfu_Guo_ITE5435_FinalExam.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
