package com.xg.Xinfu_Guo_ITE5435_FinalExam.service;

import com.xg.Xinfu_Guo_ITE5435_FinalExam.model.Customer;
import com.xg.Xinfu_Guo_ITE5435_FinalExam.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer create(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> findAll() {
        return repository.findAll();
    }

    public Customer findById(String id) {
        return repository.findById(id).orElse(null);
    }

    public Customer update(String id, Customer customer) {
        customer.setId(id);
        return repository.save(customer);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
