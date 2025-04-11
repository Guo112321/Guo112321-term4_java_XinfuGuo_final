package com.xg.Xinfu_Guo_ITE5435_FinalExam.repository;

import com.xg.Xinfu_Guo_ITE5435_FinalExam.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
