package com.xg.Xinfu_Guo_ITE5435_FinalExam.controller;

import com.xg.Xinfu_Guo_ITE5435_FinalExam.model.Customer;
import com.xg.Xinfu_Guo_ITE5435_FinalExam.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer) {
        return ResponseEntity.ok(service.create(customer));
    }

    @GetMapping
    public List<Customer> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Customer update(@PathVariable String id, @RequestBody Customer customer) {
        return service.update(id, customer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
