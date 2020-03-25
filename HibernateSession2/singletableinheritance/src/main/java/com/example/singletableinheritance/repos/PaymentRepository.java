package com.example.singletableinheritance.repos;

import com.example.singletableinheritance.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {
}
