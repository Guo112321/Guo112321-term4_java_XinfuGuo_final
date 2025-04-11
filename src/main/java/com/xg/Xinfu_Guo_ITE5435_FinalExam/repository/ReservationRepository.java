package com.xg.Xinfu_Guo_ITE5435_FinalExam.repository;

import com.xg.Xinfu_Guo_ITE5435_FinalExam.model.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
}
